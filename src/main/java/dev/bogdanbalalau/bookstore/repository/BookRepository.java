package dev.bogdanbalalau.bookstore.repository;

import dev.bogdanbalalau.bookstore.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {
    private static BookRepository instance;

    private List<Book> bookList;

    private BookRepository() {
        this.bookList = new ArrayList<>();
    }

    public static BookRepository getInstance() {
        if (instance == null) {
            instance = new BookRepository();
        }
        return instance;
    }

    public void createBook(Book book) {
        this.bookList.add(book);
    }

    public Optional<Book> getBookById(Integer id) {
        return this.bookList.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    public List<Book> getAllBooks() {
        return this.bookList;
    }

    public Book updateBook(Book book) {
        Optional<Book> optionalBook = this.getBookById(book.getId());
        if (optionalBook.isPresent()) {
            Book existingBook = optionalBook.get();
            existingBook.setTitle(book.getTitle());
            existingBook.setAuthor(book.getAuthor());
            existingBook.setDescription(book.getDescription());
            existingBook.setPrice(book.getPrice());
            return existingBook;
        }
        return null;
    }

    public void deleteBook(Book book) {
        this.bookList.remove(book);
    }
}