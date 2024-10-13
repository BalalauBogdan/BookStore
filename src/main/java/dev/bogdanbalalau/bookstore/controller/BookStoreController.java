package dev.bogdanbalalau.bookstore.controller;

import dev.bogdanbalalau.bookstore.BookStoreApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class BookStoreController {
    @FXML
    public void openCreateBookWindow() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BookStoreApplication.class.getResource("create-book-view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            stage.setTitle("Create book");
            stage.setHeight(500);
            stage.setWidth(500);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(stage.getOwner());
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void openGetBookByIdWindow() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BookStoreApplication.class.getResource("get-book-by-id-view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            stage.setTitle("Get book by id");
            stage.setHeight(500);
            stage.setWidth(500);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(stage.getOwner());
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
