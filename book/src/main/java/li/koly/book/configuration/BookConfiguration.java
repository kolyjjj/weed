package li.koly.book.configuration;

import li.koly.book.repository.BookRepository;
import li.koly.book.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfiguration {
    @Bean
    public BookService bookService(BookRepository userRepository) {
        return new BookService(userRepository);
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/images/**").addResourceLocations("file:/Users/kwli/program/gradle/weed/images/");
//    }
}
