package dev.bogdanbalalau.bookstore.controller;

import dev.bogdanbalalau.bookstore.entity.Book;
import dev.bogdanbalalau.bookstore.service.BookService;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class GetAllBooksController {
    private BookService bookService = BookService.getInstance();

    @FXML
    private TableView<Book> booksTable;

    @FXML
    private TableColumn<Book, Integer> idColumn;

    @FXML
    private TableColumn<Book, String> titleColumn;

    @FXML
    private TableColumn<Book, String> authorColumn;

    @FXML
    private TableColumn<Book, String> descriptionColumn;

    @FXML
    private TableColumn<Book, Double> priceColumn;

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        ObservableList<Book> books = FXCollections.observableArrayList(bookService.getAllBooks());
        booksTable.setItems(books);
    }
}
