package li.koly.book.utils;

import li.koly.book.domain.Book;

public class BookBuilder {
    private String ISBN;
    private String title;
    private String subTitle;
    private String author;

    public Book build() {
        Book book = new Book();
        book.setAuthor(author);
        book.setISBN(ISBN);
        book.setTitle(title);
        book.setSubTitle(subTitle);
        return book;
    }

    public BookBuilder withISBN(String isbn) {
        this.ISBN = isbn;
        return this;
    }

    public BookBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder withSubTitle(String subTitle) {
        this.subTitle = subTitle;
        return this;
    }

    public BookBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

}
