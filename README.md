Template ro structure the project

com
└── example
    └── myproject
        ├── MyProjectApplication.java
        ├── config
        │   └── DataSourceConfig.java
        ├── controller
        │   └── MyController.java
        ├── dao
        │   ├── UserRepository.java
        │   └── ProductRepository.java
        ├── dto
        │   └── UserDto.java
        ├── entity
        │   ├── User.java
        │   └── Product.java
        ├── exception
        │   ├── CustomExceptionHandler.java
        │   ├── CustomException.java
        │   └── ErrorResponse.java
        ├── service
        │   ├── UserService.java
        │   └── ProductService.java
        └── repository
            ├── UserRepositoryImpl.java
            └── ProductRepositoryImpl.java
