# Spring Boot REST H2

Spring Boot 2 REST service with JPA, Lombok and H2 Database

###Configure Gradle & Lombok

Add below to your `build.gradle` file:

[freefair lombok plugin](https://plugins.gradle.org/plugin/io.freefair.lombok)

```
plugins {
  id "io.freefair.lombok" version "3.8.4"
}
dependencies {
    compileOnly("org.projectlombok:lombok:1.16.16")
}
```
