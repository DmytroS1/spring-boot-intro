package spring_boot_intro.demo.service;

import org.springframework.stereotype.Service;
import spring_boot_intro.demo.model.Book;
import java.util.List;

@Service
public interface BookService {
    Book save(Book book);
    List<Book> findAll();
}
