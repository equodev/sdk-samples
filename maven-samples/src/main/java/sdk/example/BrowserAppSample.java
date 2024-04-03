package sdk.example;

import com.equo.application.client.EquoApp;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserAppSample {
    public static void main(String[] args) throws MalformedURLException {
        EquoApp.create("BROWSER-APP")
                .withBrowserUI()
                .launch(new URL("https://equo.dev"));
    }
}
