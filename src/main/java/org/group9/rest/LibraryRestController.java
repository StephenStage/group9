package org.group9.rest;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.group9.entity.Book;
import org.group9.entity.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/api")
public class LibraryRestController {

    BookRepository bookRepository;

    @Autowired
    public LibraryRestController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @GetMapping("/library")
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @GetMapping("/library/{isbn}")
    public Book getByIsbn(@PathVariable long isbn) {
        Book dbBook = bookRepository.getByIsbn(isbn);

        if (dbBook == null){
            throw new RuntimeException("Book not found, ISBN: " + isbn);
        }
        return dbBook;
    }
    
    
}
