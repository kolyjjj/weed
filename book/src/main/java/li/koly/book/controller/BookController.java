package li.koly.book.controller;

import li.koly.book.dto.BookDto;
import li.koly.book.dto.BookTransformer;
import li.koly.book.service.BookService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    final static Logger logger = Logger.getLogger(BookController.class);

    @Autowired
    BookService bookService;

    @RequestMapping(value = "{isbn}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public BookDto getBookByIsbn(@PathVariable String isbn) {
        logger.info("GET ---/books/" + isbn + "-------");
        return BookTransformer.transform(bookService.getBook(isbn));
    }
}
