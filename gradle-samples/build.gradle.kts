plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    id("java")
}

tasks.register<JavaExec>("runMain") {
    mainClass = properties["mainClass"]?.toString() ?: "sdk.example.SimpleAppSample"
    println("\nMain class set as: ${mainClass.get()}\n")
    val isOSGi = mainClass.get().contains("osgi")
    val project = if (isOSGi)  "osgi-app" else "app"
    classpath = project(project).sourceSets.getByName("main").runtimeClasspath
}