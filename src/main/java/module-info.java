module dev.bogdanbalalau.bookstore {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens dev.bogdanbalalau.bookstore to javafx.fxml;
    opens dev.bogdanbalalau.bookstore.entity to javafx.fxml;
    opens dev.bogdanbalalau.bookstore.controller to javafx.fxml;
    exports dev.bogdanbalalau.bookstore;
    exports dev.bogdanbalalau.bookstore.entity;
    exports dev.bogdanbalalau.bookstore.controller;
}