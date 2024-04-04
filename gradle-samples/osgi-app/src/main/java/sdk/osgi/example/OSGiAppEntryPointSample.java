package sdk.osgi.example;

import com.equo.application.client.EquoApp;

public class OSGiAppEntryPointSample {
    public static void main(String[] args) {
        EquoApp.create("APP-ENTRY-POINT")
                .addOSGICompatibilityLayer()
                .withBrowserUI()
                .launch("app.html"); // Load index.html from resources by default
    }
}
