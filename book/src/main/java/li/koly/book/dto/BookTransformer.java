package li.koly.book.dto;

import li.koly.book.domain.Book;

public class BookTransformer {
    public static BookDto transform(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setISBN(book.getISBN());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setTitle(book.getTitle());
        bookDto.setSubTitle(book.getSubTitle());
        return bookDto;
    }
}
