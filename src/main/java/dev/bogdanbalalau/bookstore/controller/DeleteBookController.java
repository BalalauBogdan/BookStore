package dev.bogdanbalalau.bookstore.controller;

import dev.bogdanbalalau.bookstore.entity.Book;
import dev.bogdanbalalau.bookstore.service.BookService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DeleteBookController {
    private BookService bookService = BookService.getInstance();

    @FXML
    private TextField bookIdField;

    @FXML
    private TextField titleField;
    @FXML
    private Label titleLabel;

    @FXML
    private TextField authorField;
    @FXML
    private Label authorLabel;

    @FXML
    private TextField descriptionField;
    @FXML
    private Label descriptionLabel;

    @FXML
    private TextField priceField;
    @FXML
    private Label priceLabel;

    @FXML
    public void findBook() {
        try {
            Book book = this.bookService.getBookById(Integer.valueOf(bookIdField.getText()));
            this.titleField.setText(book.getTitle());
            this.authorField.setText(book.getAuthor());
            this.descriptionField.setText(book.getDescription());
            this.priceField.setText(book.getPrice().toString());

            this.titleLabel.setVisible(true);
            this.titleField.setVisible(true);
            this.authorLabel.setVisible(true);
            this.authorField.setVisible(true);
            this.descriptionLabel.setVisible(true);
            this.descriptionField.setVisible(true);
            this.priceLabel.setVisible(true);
            this.priceField.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void deleteBook() {
        Integer id = Integer.valueOf(this.bookIdField.getText());
        try {
            this.bookService.deleteBook(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
