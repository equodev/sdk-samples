package sdk.osgi.example;

import com.equo.application.client.EquoApp;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserOSGiAppSample {
    public static void main(String[] args) throws MalformedURLException {
        EquoApp.create("BROWSER-APP")
                .addOSGICompatibilityLayer()
                .withBrowserUI()
                .launch(new URL("https://equo.dev"));
    }
}
