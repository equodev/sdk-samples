# SDK Samples

SDK Samples is a collection of sample applications to test and prove the Equo SDK.

## Using Maven

You can run the application with Maven.

> [!IMPORTANT]  
> Crucial information necessary for users to succeed.
>
> You must add the Chromium dependency based on your `Operative System` and `architecture`. Use one of the following options:
> ```xml
> <!-- OS: Linux, Arch: x86_64 -->
> <dependency>
>   <groupId>com.equo</groupId>
>   <artifactId>com.equo.chromium.cef.gtk.linux.x86_64</artifactId>
>   <version>116.0.6</version>
>   <scope>runtime</scope>
> </dependency>
> 
> <!-- OS: Windows, Arch: x86_64 -->
> <dependency>
>   <groupId>com.equo</groupId>
>   <artifactId>com.equo.chromium.cef.win32.win32.x86_64</artifactId>
>   <version>116.0.6</version>
>   <scope>runtime</scope>
> </dependency>
> 
> <!-- OS: macOS, Arch: x86_64 -->
> <dependency>
>   <groupId>com.equo</groupId>
>   <artifactId>com.equo.chromium.cef.cocoa.macosx.x86_64</artifactId>
>   <version>116.0.6</version>
>   <scope>runtime</scope>
> </dependency>
> 
> <!-- OS: Windows, Arch: x86 -->
> <dependency>
>   <groupId>com.equo</groupId>
>   <artifactId>com.equo.chromium.cef.win32.win32.x86</artifactId>
>   <version>116.0.6</version>
>   <scope>runtime</scope>
> </dependency>
> 
> <!-- OS: Linux, Arch: aarch64 -->
> <dependency>
>   <groupId>com.equo</groupId>
>   <artifactId>com.equo.chromium.cef.gtk.linux.aarch64</artifactId>
>   <version>116.0.6</version>
>   <scope>runtime</scope>
> </dependency>
> 
> <!-- OS: macOS, Arch: aarch64 -->
> <dependency>
>   <groupId>com.equo</groupId>
>   <artifactId>com.equo.chromium.cef.cocoa.macosx.aarch64</artifactId>
>   <version>116.0.6</version>
>   <scope>runtime</scope>
> </dependency>
> ``` 

### Run a sample application

Run the following command in the command line:

```sh
mvn compile exec:java -f app

# or

mvn compile exec:java -f app -Dexec.mainClass="sdk.example.SimpleAppSample"
```
### Run an OSGi sample application

```sh
mvn compile exec:java -f osgi-app

# or

mvn compile exec:java -f osgi-app -Dexec.mainClass="sdk.osgi.example.SimpleOSGiAppSample"
```