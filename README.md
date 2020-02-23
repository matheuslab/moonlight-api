# To the Moon

[![Build Status](https://cloud.drone.io/api/badges/matheuslab/to-the-moon/status.svg)](https://cloud.drone.io/matheuslab/to-the-moon)

![To the Moon](img/tothemoon.jpg)

### Prerequisites

* [Java](https://www.java.com/) 11
* [Gradle](https://gradle.org/) 5.5.1

### Installing

On the terminal:
* Set the Java 11 (if you're not using SDKMAN)
```
export JAVA_HOME=<jdk-11-path>
export PATH=$JAVA_HOME/bin:$PATH
```
#### Build

* Build the project
```
cd <path>/tothemoon/
./gradlew clean build
```

### API

```
cd api
../gradlew bootRun
```
* For Hot Reloading (Continuous Build Execution)
```
./gradlew clean build -t (use & to run in background)

cd api
../gradlew bootRun (in other console, if you didn't run clean build in brackground)
```

## Built With

* [Java](https://www.java.com/) - Programming language
* [Gradle](https://gradle.org/) - Build automation tool
* [Spring](https://spring.io/) - Comprehensive programming and configuration model for modern Java-based applications
* [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications
* [Checkstyle](https://docs.gradle.org/5.2.1/userguide/checkstyle_plugin.html) - Performs quality checks on your project’s Java source files using [Checkstyle](http://checkstyle.sourceforge.net/index.html) and generates reports from these checks
* [JaCoCo](https://docs.gradle.org/5.2.1/userguide/jacoco_plugin.html) - The JaCoCo plugin provides code coverage metrics for Java code via integration with [JaCoCo](https://www.eclemma.org/jacoco/)
* [JUnit 5](https://docs.gradle.org/current/userguide/java_testing.html#using_junit5) - The JUnit Platform serves as a foundation for launching testing frameworks on the JVM.
* [Mockito](https://site.mockito.org/) - Tasty mocking framework for unit tests in Java
* [Hamcrest](http://hamcrest.org/) - Framework for writing matcher objects allowing 'match' rules to be defined declaratively. There are a number of situations where matchers are invaluable, such as UI validation, or data filtering, but it is in the area of writing flexible tests that matchers are most commonly used