# SDK Samples

SDK Samples is a collection of sample applications to test and prove the Equo SDK.

## Using Gradle

You can run the application with Gradle. By default, it uses the main class `sdk.example.SimpleAppSample`.

### Add Chromium Dependency

First, to run a Gradle sample, it is mandatory add the Chromium dependency based on the operative system and the architecture of your computer.

```sh
# Linux System
# arch: x86_64
runtimeOnly("com.equo:com.equo.chromium.cef.gtk.linux.x86_64:$chromium_version")
# arch: x86
runtimeOnly("com.equo:com.equo.chromium.cef.gtk.linux.x86:$chromium_version")
# arch: aarch64
runtimeOnly("com.equo:com.equo.chromium.cef.gtk.linux.aarch64:$chromium_version")


# Windows System
# arch: x86_64
runtimeOnly("com.equo:com.equo.chromium.cef.win32.win32.x86_64:$chromium_version")
# arch: x86
runtimeOnly("com.equo:com.equo.chromium.cef.win32.win32.x86:$chromium_version")


# Mac System
# arch: x86_64
runtimeOnly("com.equo:com.equo.chromium.cef.cocoa.macosx.x86_64:$chromium_version")
# arch: aarch64
runtimeOnly("com.equo:com.equo.chromium.cef.cocoa.macosx.aarch64:$chromium_version")
```

### Run a sample application

Run the following command in the command line:

```sh
./gradlew runMain

# or

./gradlew runMain -PmainClass=sdk.example.BrowserAppSample
```
