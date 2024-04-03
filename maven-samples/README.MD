# SDK Samples

SDK Samples is a collection of sample applications to test and prove the Equo SDK.

## Using Maven

You can run the application with Maven.

Run the following command in the command line:

### Linux

This is an example for SimpleAppSample application

```bash
# arch: x86_64
mvn exec:java -Dexec.mainClass="sdk.example.SimpleAppSample" -Dequo.platform="gtk.linux.x86_64"

# arch: x86
mvn exec:java -Dexec.mainClass="sdk.example.SimpleAppSample" -Dequo.platform="gtk.linux.x86"

# arch: aarch64
mvn exec:java -Dexec.mainClass="sdk.example.SimpleAppSample" -Dequo.platform="gtk.linux.aarch64"
```

### windows

This is an example for SimpleAppSample application

```bash
# arch: x86_64
mvn exec:java -Dexec.mainClass="sdk.example.SimpleAppSample" -Dequo.platform="win32.win32.x86_64"

# arch: x86
mvn exec:java -Dexec.mainClass="sdk.example.SimpleAppSample" -Dequo.platform="win32.win32.x86"
```

### Mac

This is an example for SimpleAppSample application

```bash
# arch: x86_64
mvn exec:java -Dexec.mainClass="sdk.example.SimpleAppSample" -Dequo.platform="cocoa.macosx.x86_64"

# arch: aarch64
mvn exec:java -Dexec.mainClass="sdk.example.SimpleAppSample" -Dequo.platform="cocoa.macosx.aarch64"

```
