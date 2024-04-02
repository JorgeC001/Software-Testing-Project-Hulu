plugins {
    id("java")
    id("io.freefair.lombok") version "8.6"
}

group = "edu.fgcu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.seleniumhq.selenium:selenium-java:4.18.1")
    implementation("org.seleniumhq.selenium:selenium-firefox-driver:4.18.1")

    implementation("io.github.bonigarcia:webdrivermanager:5.7.0")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

}

tasks.test {
    useJUnitPlatform()
}