### Iced-Latte (Backend) Project Overview


**Iced-Latte** is a non-profit sandbox project I have developed, aimed at building a modern coffee marketplace. This initiative serves as a platform to enhance both my soft and hard skills while contributing to a meaningful and engaging project.

### Tech Stack

**Architecture**: Monolith  
**Programming Language**: Java 17  
**Frameworks**: 
- Spring Web
- Spring Boot 3
- Spring Data
- Spring Security
- Spring Actuator
- Spring Retry
- Lombok
- Apache Commons
- Spring Mail
- Google Guava

**Security**: JWT, TLS  
**Migration Tool**: Liquibase  
**Logging**: Log4j2, Slf4j  
**Unit Tests**: JUnit 5  
**End-to-End Tests**: Rest Assured, Test Containers  
**Converter**: MapStruct  
**Test Coverage**: Jacoco  
**API Specifications**: OpenAPI + Spring Docs  
**Validation**: Javax Validation  

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
