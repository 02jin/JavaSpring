plugins {
    id("org.springframework.boot") version "3.1.0" // Spring Boot 최신 버전
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("jvm") version "1.8.0" // Kotlin 버전
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<org.springframework.boot.gradle.tasks.run.BootRun> {
    mainClass.set("com.example.demospring.DemoSpringApplication")
}

