# SDK Samples

SDK Samples is a collection of sample applications to test and prove the Equo SDK.

## Using Gradle

You can run the application with Gradle. By default, it uses the main class `sdk.example.SimpleAppSample`.

### Run a sample application

Run the following command in the command line:

```sh
./gradlew app:run

# or

./gradlew app:run -PmainClass=sdk.example.BrowserAppSample
```
### Run an OSGi sample application

```sh
./gradlew osgi-app:run

# or

./gradlew osgi-app:run -PmainClass=sdk.osgi.example.BrowserAppSample
```