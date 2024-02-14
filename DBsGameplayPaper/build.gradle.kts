plugins {
    id("java")
}

group = "net.dbsgameplay"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


tasks.withType<Jar> {
    archiveBaseName.set("${project.name}-${project.version}")
    val outputDir = file("$rootDir/build/all-jars")
    into(outputDir)
}