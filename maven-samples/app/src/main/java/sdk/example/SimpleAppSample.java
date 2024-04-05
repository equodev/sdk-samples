package sdk.example;

import com.equo.application.client.EquoApp;

import java.net.MalformedURLException;
import java.net.URL;

public class SimpleAppSample {
    public static void main(String[] args) throws MalformedURLException {
        EquoApp.create("SIMPLE-APP")
                .launch(new URL("https://equo.dev"));
    }
}
