# Run a sample application using Gradle

To run the sample application with Gradle, run the following command in the command line:

```sh
# By default, it uses the main class `sdk.example.SimpleAppSample`.
./gradlew app:run

# or

./gradlew app:run -PmainClass="sdk.example.BrowserAppSample"
```

## OSGi sample application

To run the sample application with OSGi Gradle, run the following command in the command line:

```sh
# By default, it uses the main class `sdk.osgi.example.SimpleOSGiAppSample`.
./gradlew osgi-app:run

# or

./gradlew osgi-app:run -PmainClass="sdk.osgi.example.BrowserOSGiAppSample"
```
