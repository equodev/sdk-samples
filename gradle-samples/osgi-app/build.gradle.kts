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
    implementation("dev.equo:dev.equo.sdk:0.0.1-SNAPSHOT")
    runtimeOnly("dev.equo:dev.equo.sdk:0.0.1-SNAPSHOT") {
        capabilities {
            requireCapability("dev.equo:core-osgi-support")
        }
    }
}

tasks.register<JavaExec>("runOsgiMain") {
    mainClass = properties["mainClass"]?.toString() ?: "sdk.osgi.example.SimpleOSGiAppSample"
    println("\nMain class set as: ${mainClass.get()}\n")
    classpath = sourceSets.getByName("main").runtimeClasspath
}
