package li.koly.book.service;

import li.koly.book.domain.Book;
import li.koly.book.repository.BookRepository;
import li.koly.book.utils.BookBuilder;

import java.util.Arrays;
import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return Arrays.asList(
                new BookBuilder()
                        .withAuthor("koly")
                        .withISBN("102830912830")
                        .withTitle("Amazing World")
                        .withSubTitle("meet the wird weed")
                        .build()
        );
    }

    public Book getBook(String isbn) {
        return bookRepository.findOne(isbn);
    }
}
