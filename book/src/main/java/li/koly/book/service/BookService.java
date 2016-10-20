package li.koly.book.service;

import li.koly.book.domain.Book;
import li.koly.book.utils.BookBuilder;

import java.util.Arrays;
import java.util.List;

public class BookService {
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
}
