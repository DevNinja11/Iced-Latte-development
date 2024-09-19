### Iced-Latte (Backend) Project Overview


**Iced-Latte** is a non-profit sandbox project I have developed, aimed at building a modern coffee marketplace. This initiative serves as a platform to enhance both my soft and hard skills while contributing to a meaningful and engaging project.

### Tech Stack

**Architecture**: Monolith  
**Programming Language**: ![Java 17](https://img.shields.io/badge/Java%2017-Version%2017-blue)  

**Frameworks**:  
![Spring Web](https://img.shields.io/badge/Spring%20Web-Framework%20for%20Java%20Web%20Apps-green)  
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Framework%20for%20Java%20Applications-orange)  
![Spring Data](https://img.shields.io/badge/Spring%20Data-Data%20Access%20Framework-lightgreen)  
![Spring Security](https://img.shields.io/badge/Spring%20Security-Security%20for%20Java%20Applications-red)  
![Spring Actuator](https://img.shields.io/badge/Spring%20Actuator-Production%20Monitoring%20Tools-blue)  
![Spring Retry](https://img.shields.io/badge/Spring%20Retry-Retry%20Logic%20for%20Java%20Applications-lightblue)  
![Lombok](https://img.shields.io/badge/Lombok-Code%20Boilerplate%20Reduction-ff69b4)  
![Apache Commons](https://img.shields.io/badge/Apache%20Commons-Utility%20Libraries-darkblue)  
![Spring Mail](https://img.shields.io/badge/Spring%20Mail-Email%20Sending%20Framework-lightgray)  
![Google Guava](https://img.shields.io/badge/Google%20Guava-Utility%20Library%20for%20Java-ff9800)  

**Security**: ![JWT](https://img.shields.io/badge/JWT-JSON%20Web%20Token-orange) | ![TLS](https://img.shields.io/badge/TLS-Transport%20Layer%20Security-brightgreen)  
**Migration Tool**: ![Liquibase](https://img.shields.io/badge/Liquibase-Database%20Migration%20Tool-blue)  
**Logging**: ![Log4j2](https://img.shields.io/badge/Log4j2-Logging%20Framework-red) | ![Slf4j](https://img.shields.io/badge/Slf4j-Logging%20Facade-orange)  
**Unit Tests**: ![JUnit 5](https://img.shields.io/badge/JUnit%205-Unit%20Testing%20Framework-lightgreen)  
**End-to-End Tests**: ![Rest Assured](https://img.shields.io/badge/Rest%20Assured-Testing%20Library-yellow) | ![Test Containers](https://img.shields.io/badge/Test%20Containers-Integration%20Testing%20Library-lightblue)  
**Converter**: ![MapStruct](https://img.shields.io/badge/MapStruct-Java%20Bean%20Mapping%20Library-blue)  
**Test Coverage**: ![Jacoco](https://img.shields.io/badge/Jacoco-Test%20Coverage%20Tool-orange)  
**API Specifications**: ![OpenAPI](https://img.shields.io/badge/OpenAPI-API%20Specification%20Standard-green) + ![Spring Docs](https://img.shields.io/badge/Spring%20Docs-Spring%20API%20Documentation-orange)  
**Validation**: ![Javax Validation](https://img.shields.io/badge/Javax%20Validation-Bean%20Validation%20API-lightgray)  

## Key Features

- **Modern Coffee Marketplace**: A platform designed to connect coffee lovers and sellers.
- **Monolithic Architecture**: Utilizes a monolithic structure for streamlined development and deployment.
- **Java 17**: Built using the latest Java version for improved performance and features.
- **Spring Framework Suite**: Leverages various Spring technologies for robust backend functionality.
- **Security Protocols**: Implements JWT and TLS for secure authentication and data transmission.
- **Automated Migration**: Uses Liquibase for managing database changes seamlessly.
- **Comprehensive Logging**: Integrates Log4j2 and Slf4j for efficient logging and monitoring.
- **Extensive Testing**: Employs JUnit 5 and Rest Assured for thorough unit and end-to-end testing.
- **Flexible Deployment**: Utilizes Docker containers for easy deployment via SSH.
- **Community Contributions**: Encourages open-source collaboration and feature proposals.
- 
### Quick Start

To get started with the project, follow the setup instructions provided in the `START.MD` file.

### Deployment

The project does not utilize Kubernetes (k8s) or AWS. Instead, we deploy Docker containers directly via SSH. The production configuration is detailed in the `docker-compose.local.yml` file. Deployment processes are automated using GitHub Actions, which handle build, test, and deployment tasks for changes merged into the master branch. For more details, explore the `.github` folder.

We welcome proposals for improving our deployment processes.

### Forking and Contributions

**Forks**: Contributions are welcome. To maintain synchronization with the main codebase and benefit the community, please:

1. Share any new features you implement.
2. Avoid using our issues and official channels as a support desk; use chat channels for support.

**Reporting Bugs**: 
1. Open a new issue if you encounter a bug.
2. Use the search function to check if the issue has already been reported.
3. Clearly describe the observed and expected behavior to assist contributors and maintainers. For minor fixes, consider opening a pull request (PR).

**Proposing New Features**:
1. Visit our Discussions section.
2. Check if the feature has already been proposed.
3. Create a new discussion if needed.
4. For UI/UX related proposals, attach a screenshot or wireframe.

### Contributions and Community

**Interaction**: The primary point of interaction is the Issues page. Although English is the official development language to accommodate all users, we are open to communication in Russian for commits and comments.

**Development**: To contribute code:
1. Review the Issues page for the most critical tickets.
2. Select an issue and leave a comment to indicate your intent to work on it.
3. For significant changes, open an issue or comment on an existing one to discuss your planned modifications.

### License

The Iced-Latte project is licensed under the MIT License. This allows the code to be used for both private and commercial purposes, provided that proper author attribution is maintained by including the original license file or mentioning the Iced-Latte project.

### Snapshot
