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

    @FXML
    public void openGetAllBooksWindow() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BookStoreApplication.class.getResource("get-all-books-view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            stage.setTitle("All books");
            stage.setHeight(1000);
            stage.setWidth(1000);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(stage.getOwner());
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void openUpdateBookWindow() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BookStoreApplication.class.getResource("update-book-view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            stage.setTitle("Update book");
            stage.setHeight(600);
            stage.setWidth(600);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(stage.getOwner());
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void openDeleteBookWindow() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BookStoreApplication.class.getResource("delete-book-view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            stage.setTitle("Delete book");
            stage.setHeight(600);
            stage.setWidth(600);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(stage.getOwner());
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
