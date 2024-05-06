plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    id("application")
    id("com.google.osdetector") version "1.7.3"
}

application {
    mainClass = properties["mainClass"]?.toString() ?: "sdk.example.SimpleAppSample"
}

repositories {
    maven("https://dl.equo.dev/chromium-swt-ee/equo-gpl/mvn")
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    implementation("dev.equo:dev.equo.sdk:${properties["sdk-version"]}")
    runtimeOnly("dev.equo:dev.equo.sdk:${properties["sdk-version"]}") {
        capabilities {
            requireCapability("dev.equo:core-chromium-${osdetector.arch}-${osdetector.os}")
        }
    }
}
