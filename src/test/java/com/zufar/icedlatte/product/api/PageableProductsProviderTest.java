package com.zufar.icedlatte.product.api;

import com.zufar.icedlatte.openapi.dto.ProductInfoDto;
import com.zufar.icedlatte.openapi.dto.ProductListWithPaginationInfoDto;
import com.zufar.icedlatte.product.converter.ProductInfoDtoConverter;
import com.zufar.icedlatte.product.entity.ProductInfo;
import com.zufar.icedlatte.product.repository.ProductInfoRepository;
import org.instancio.Instancio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class PageableProductsProviderTest {

    @Mock
    private ProductInfoRepository productRepository;

    @Mock
    private ProductInfoDtoConverter productInfoConverter;

    @Mock
    private ProductUpdater productUpdater;

    @InjectMocks
    private PageableProductsProvider productsProvider;

    private List<ProductInfo> products;

    @BeforeEach
    void setUp() {
        products = Instancio.ofList(ProductInfo.class).create();
    }

    @Test
    void shouldFetchProductsUsingPageAttributes() {
        Page<ProductInfo> page = new PageImpl<>(products);
        final int pageNumber = 1;
        final int pageSize = 10;
        final String sortAttribute = "name";
        Sort.Direction sortDirection = Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sortDirection, sortAttribute);

        when(productRepository.findAllProducts( null, null, null, null, null, pageable)).thenReturn(page);
        when(productInfoConverter.toDto(any(ProductInfo.class))).thenReturn(mock(ProductInfoDto.class));
        when(productInfoConverter.toProductPaginationDto(ArgumentMatchers.any())).thenReturn(mock(ProductListWithPaginationInfoDto.class));
        when(productUpdater.update(any(ProductInfoDto.class))).thenReturn(mock(ProductInfoDto.class));

        ProductListWithPaginationInfoDto productList = productsProvider.getProducts(pageable, null, null, null, null, null);

        assertNotNull(productList);

        verify(productRepository, times(1)).findAllProducts( null, null, null, null, null, pageable);
        verify(productInfoConverter, times(1)).toProductPaginationDto(ArgumentMatchers.any());
    }
}
