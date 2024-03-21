package sdk.example;

import com.equo.application.client.ConfigLocations;
import com.equo.application.client.EquoApp;

import java.nio.file.Path;

public class ConfigLocationsSample {
    public static void main(String[] args) {
        EquoApp.setAppName("CONFIG-LOCATIONS-SAMPLE");

        System.out.println("DIR Cache:" + ConfigLocations.cacheHome());
        System.out.println("DIR Data:" + ConfigLocations.dataHome());
        System.out.println("DIR State:" + ConfigLocations.stateHome());
        System.out.println("DIR Runtime:" + ConfigLocations.runtimeHome());
        System.out.println();

        var userHome = System.getProperty("user.home");
        ConfigLocations.overrideCacheHome(Path.of(userHome, "CUSTOM-FOLDER-CACHE"));
        ConfigLocations.overrideDataHome(Path.of(userHome, "CUSTOM-FOLDER-DATA"));
        ConfigLocations.overrideStateHome(Path.of(userHome, "CUSTOM-FOLDER-STATE"));
        ConfigLocations.overrideRuntimeHome(Path.of(userHome, "CUSTOM-FOLDER-RUNTIME"));

        System.out.println("DIR Cache:" + ConfigLocations.cacheHome());
        System.out.println("DIR Data:" + ConfigLocations.dataHome());
        System.out.println("DIR State:" + ConfigLocations.stateHome());
        System.out.println("DIR Runtime:" + ConfigLocations.runtimeHome());
    }
}
