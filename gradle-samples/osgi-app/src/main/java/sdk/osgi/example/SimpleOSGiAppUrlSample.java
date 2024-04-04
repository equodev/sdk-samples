package sdk.osgi.example;

import com.equo.application.client.EquoApp;

public class SimpleOSGiAppUrlSample {
    public static void main(String[] args) {
        EquoApp.create("SIMPLE-URL-APP")
                .addOSGICompatibilityLayer()
                .launch("https://equo.dev");
    }
}
