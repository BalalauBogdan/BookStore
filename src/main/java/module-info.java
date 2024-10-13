module dev.bogdanbalalau.bookstore {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens dev.bogdanbalalau.bookstore to javafx.fxml;
    opens dev.bogdanbalalau.bookstore.controller to javafx.fxml;
    exports dev.bogdanbalalau.bookstore;
}