plugins {
    id("java")
    id("org.hibernate.orm") version "6.4.4.Final"
}

group = "net.dbsgameplay.core"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // https://mvnrepository.com/artifact/javax.persistence/javax.persistence-api
    implementation("javax.persistence:javax.persistence-api:2.2")
    implementation("mysql:mysql-connector-java:8.0.15")
    implementation("com.google.inject:guice:7.0.0")
}

tasks.test {
    useJUnitPlatform()
}