package dev.bogdanbalalau.bookstore.controller;

import dev.bogdanbalalau.bookstore.entity.Book;
import dev.bogdanbalalau.bookstore.service.BookService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

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
        this.bookService.createBook(titleField.getText(), authorField.getText(), descriptionField.getText(), Double.parseDouble(priceField.getText()));
    }
}
