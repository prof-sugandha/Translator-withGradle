plugins {
    id("java")
    id("application")
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "edu.bsu.cs"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21)) // <- match your installed JDK
    }
}

javafx {
    // Use a stable release that matches your JDK (e.g., 21.x with JDK 21)
    version = "21.0.5"
    modules("javafx.controls", "javafx.fxml")
}

application {
    // If you have module-info.java, also set mainModule below.
    mainClass.set("edu.bsu.cs.UI")
    // mainModule.set("edu.bsu.cs") // <- uncomment if you have a module-info.java named 'module edu.bsu.cs { ... }'
}
