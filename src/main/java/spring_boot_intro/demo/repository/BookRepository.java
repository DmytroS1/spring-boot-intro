package spring_boot_intro.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import spring_boot_intro.demo.model.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book save(Book book);
    List<Book> findAll();
}
