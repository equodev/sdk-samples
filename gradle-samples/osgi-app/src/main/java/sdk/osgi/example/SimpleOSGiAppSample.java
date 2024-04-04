package sdk.osgi.example;

import com.equo.application.client.EquoApp;

import java.net.MalformedURLException;
import java.net.URL;

public class SimpleOSGiAppSample {
    public static void main(String[] args) throws MalformedURLException {
        EquoApp.create("SIMPLE-APP")
                .addOSGICompatibilityLayer()
                .launch(new URL("https://equo.dev"));
    }
}