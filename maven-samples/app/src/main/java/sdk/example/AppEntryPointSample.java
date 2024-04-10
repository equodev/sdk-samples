package sdk.example;

import com.equo.application.client.EquoApp;

public class AppEntryPointSample {
    public static void main(String[] args) {
        EquoApp.create("APP-ENTRY-POINT")
                .withBrowserUI()
                .launch("app.html"); // Load index.html from resources by default
    }
}
