plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    id("application")
}

repositories {
    maven("https://dl.equo.dev/middleware/mvn/release")
    maven("https://dl.equo.dev/chromium-swt-ee/equo-gpl/mvn")
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    implementation("dev.equo:dev.equo.sdk:0.0.2")
    runtimeOnly("dev.equo:dev.equo.sdk:0.0.2") {
        capabilities {
            requireCapability("dev.equo:core-osgi-support")
        }
    }
}
