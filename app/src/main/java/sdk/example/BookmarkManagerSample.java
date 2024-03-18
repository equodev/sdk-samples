package sdk.example;

import com.equo.application.client.EquoApp;
import com.equo.application.client.bookmarks.BookmarkFolder;
import com.equo.application.client.bookmarks.BookmarkManager;

public class BookmarkManagerSample {
    public static void main(String[] args) {
        BookmarkManager bookmarkManager = (BookmarkManager) BookmarkManager.create("My custom bookmarks")
                .addBookmark("https://equo.dev", "Equo Page")
                .addFolder(BookmarkFolder.create("Docs").addBookmark("https://docs.equo.dev", "Equo docs"))
                .addFolder(BookmarkFolder.create("Social").addBookmark("https://twitter.com/Equo_Dev", "Twitter Equo"));

        EquoApp.create("BOOKMARKS-SAMPLE")
                .withBookmarks(bookmarkManager)
                .withBrowserUI()
                .launch("https://equo.dev");
    }
}
