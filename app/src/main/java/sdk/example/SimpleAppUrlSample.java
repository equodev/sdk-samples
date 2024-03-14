package sdk.example;

import com.equo.application.client.EquoApp;

import java.net.MalformedURLException;
import java.net.URL;

public class SimpleAppUrlSample {
    public static void main(String[] args) {
        EquoApp.create("SIMPLE-URL-APP")
                .launch("https://equo.dev");
    }
}
