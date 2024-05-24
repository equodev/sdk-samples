# SDK Samples

SDK Samples is a collection of sample applications to test and prove the Equo SDK.

## Run a sample application using Gradle

To run the sample application with Gradle, run the following command in the command line:

```sh
# By default, it uses the main class `sdk.example.SimpleAppSample`.
./gradlew app:run

# or

./gradlew app:run -PmainClass="sdk.example.BrowserAppSample"
```

### OSGi sample application

To run the sample application with OSGi Gradle, run the following command in the command line:

```sh
# By default, it uses the main class `sdk.osgi.example.SimpleOSGiAppSample`.
./gradlew osgi-app:run

# or

./gradlew osgi-app:run -PmainClass="sdk.osgi.example.BrowserOSGiAppSample"
```

## Run a sample application using Maven

You must add the Equo Chromium dependencies, based on your operative system and architecture. Use one of the following options depending on your OS:

```xml
<!-- OS: Linux, Arch: x86_64 -->
<dependency>
  <groupId>com.equo</groupId>
  <artifactId>com.equo.chromium.cef.gtk.linux.x86_64</artifactId>
  <version>116.0.6</version>
  <scope>runtime</scope>
</dependency>

<!-- OS: Windows, Arch: x86_64 -->
<dependency>
  <groupId>com.equo</groupId>
  <artifactId>com.equo.chromium.cef.win32.win32.x86_64</artifactId>
  <version>116.0.6</version>
  <scope>runtime</scope>
</dependency>

<!-- OS: macOS, Arch: x86_64 -->
<dependency>
  <groupId>com.equo</groupId>
  <artifactId>com.equo.chromium.cef.cocoa.macosx.x86_64</artifactId>
  <version>116.0.6</version>
  <scope>runtime</scope>
</dependency>

<!-- OS: Windows, Arch: x86 -->
<dependency>
  <groupId>com.equo</groupId>
  <artifactId>com.equo.chromium.cef.win32.win32.x86</artifactId>
  <version>116.0.6</version>
  <scope>runtime</scope>
</dependency>

<!-- OS: Linux, Arch: aarch64 -->
<dependency>
  <groupId>com.equo</groupId>
  <artifactId>com.equo.chromium.cef.gtk.linux.aarch64</artifactId>
  <version>116.0.6</version>
  <scope>runtime</scope>
</dependency>

<!-- OS: macOS, Arch: aarch64 -->
<dependency>
  <groupId>com.equo</groupId>
  <artifactId>com.equo.chromium.cef.cocoa.macosx.aarch64</artifactId>
  <version>116.0.6</version>
  <scope>runtime</scope>
</dependency>
```

To run your application with Maven, run the following command in the command line:

```bash
# By default, it uses the main class `sdk.example.SimpleAppSample`.
mvn compile exec:java -f app

# or

mvn compile exec:java -f app -Dexec.mainClass="sdk.example.SimpleAppSample"
```

### OSGi sample application

To run the sample application with OSGi Maven, run the following command in the command line:

```sh
# By default, it uses the main class `sdk.osgi.example.SimpleOSGiAppSample`.
mvn compile exec:java -f osgi-app

# or

mvn compile exec:java -f osgi-app -Dexec.mainClass="sdk.osgi.example.SimpleOSGiAppSample"
```