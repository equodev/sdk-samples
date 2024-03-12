# SDK Samples

SDK Samples is an example application to test and prove the Equo SDK.

## Using gradle

You can run the application with gradle, by default uses the main class <strong>sdk.example.SimpleAppSample</strong>,
running the following command line
```bash
./gradlew runMain
```

### Change the Main Class

To change the main class using gradle you can execute it as follow
```bash
./gradlew runMain -PmainClassName=package.MainClass
```

For example:
```bash
./gradlew runMain -PmainClassName=sdk.example.BrowserAppSample
```