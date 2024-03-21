package sdk.example;

import com.equo.application.client.EquoApp;

import java.net.MalformedURLException;
import java.net.URL;

public class NewTabPageURLSample {
    public static void main(String[] args) throws MalformedURLException {
        EquoApp.create("CUSTOM-NEW-TAB-PAGE")
                .withBrowserUI()
                .setNewTabPageURL("https://equo.dev")
                .launch(new URL("https://equo.dev"));
    }
}
