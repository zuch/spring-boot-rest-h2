# Spring Boot REST H2

Spring Boot 2 REST service with JPA, Lombok and H2 Database

### Configure Gradle & Lombok

[Freefair Lombok Plugin](https://plugins.gradle.org/plugin/io.freefair.lombok)

Add below to your `build.gradle` file:

```
plugins {
  id "io.freefair.lombok" version "3.8.4"
}
dependencies {
    compileOnly("org.projectlombok:lombok:1.16.16")
}
```

### Configure Intellij & Lombok

[Setup Intellij IDEA & Lombok](https://projectlombok.org/setup/intellij)

- Go to `File > Settings > Plugins`
- Click on `Browse repositories...`
- Search for `Lombok Plugin`
- Click on `Install plugin`
- Restart IntelliJ IDEA

