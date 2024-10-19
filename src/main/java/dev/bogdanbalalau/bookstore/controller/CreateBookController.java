package dev.bogdanbalalau.bookstore.controller;

import dev.bogdanbalalau.bookstore.service.BookService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CreateBookController {
    private BookService bookService = BookService.getInstance();

    @FXML
    private TextField titleField;

    @FXML
    private TextField authorField;

    @FXML
    private TextField descriptionField;

    @FXML
    private TextField priceField;

    @FXML
    public void saveBook() {
        try {
            this.bookService.createBook(titleField.getText(), authorField.getText(), descriptionField.getText(), Double.parseDouble(priceField.getText()));
            this.showConfirmationMessage(AlertType.INFORMATION,"Confirmation","Book created successfully");
        } catch (Exception e) {
            this.showConfirmationMessage(AlertType.ERROR,"Error","Please fill in all the fields");
        }
    }

    private void showConfirmationMessage(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
