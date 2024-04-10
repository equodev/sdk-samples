package sdk.example;

import com.equo.application.client.EquoApp;
import com.equo.application.client.os.CommonFolders;

public class CommonFoldersSample {
    public static void main(String[] args) {
        EquoApp.setAppName("COMMON-FOLDERS-SAMPLE");

        var folders = CommonFolders.getInstance();
        System.out.println("DIR Config: " + folders.configDir());
        System.out.println("DIR Cache: " + folders.cacheDirHome());
        System.out.println("DIR Data: " + folders.dataDirHome());
        System.out.println("DIR State: " + folders.stateDirHome());
        System.out.println("DIR Runtime: " + folders.runtimeDirHome());
    }
}
