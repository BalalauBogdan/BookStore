package dev.bogdanbalalau.bookstore.service;

import dev.bogdanbalalau.bookstore.entity.Book;
import dev.bogdanbalalau.bookstore.repository.BookRepository;

import java.util.List;
import java.util.Optional;

public class BookService {
    private static BookService instance;
    private BookRepository bookRepository;
    private Integer idGenerator = 0;

    private BookService() {
        this.bookRepository = BookRepository.getInstance();
    }

    public static BookService getInstance() {
        if (instance == null) {
            instance = new BookService();
        }
        return instance;
    }

    public void createBook(String title, String author, String description, Double price) {
        Book book = new Book(++this.idGenerator, title, author, description, price);
        this.bookRepository.createBook(book);
    }

    public Book getBookById(Integer id) throws Exception {
        Optional<Book> optionalBook = this.bookRepository.getBookById(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        }
        throw new Exception("Book not found with id: " + id);
    }

    public List<Book> getAllBooks() {
        return this.bookRepository.getAllBooks();
    }

    public void updateBook(Integer id, String title, String author, String description, Double price) throws Exception {
        Book book = new Book(id, title, author, description, price);
        Book updatedBook = this.bookRepository.updateBook(book);
        if (updatedBook == null) {
            throw new Exception("Book not found with id: " + id);
        }
    }

    public void deleteBook(Integer id) throws Exception {
        Book book = this.getBookById(id);
        this.bookRepository.deleteBook(book);
    }
}
