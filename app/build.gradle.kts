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
    implementation("dev.equo:dev.equo.sdk:0.0.1")
}

tasks.register<JavaExec>("runMain") {
    mainClass = "sdk.example.SimpleAppSample"
    if (project.hasProperty("mainClassName")) {
        val userMain = project.property("mainClassName")
        if (userMain != null) {
            mainClass = userMain as String
        } else {
            println("You can set your own main class as: ./gradlew runMain -PmainClassName=package.MainClass")
        }
    }
    println("\nMain class set as: ${mainClass.get()}\n")
    classpath = sourceSets.getByName("main").runtimeClasspath
}
