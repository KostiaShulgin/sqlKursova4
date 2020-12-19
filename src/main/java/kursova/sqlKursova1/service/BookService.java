package kursova.sqlKursova1.service;

import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import kursova.sqlKursova1.entities.Book;
import kursova.sqlKursova1.repositories.BookRepository;

@Service
@AllArgsConstructor
public class BookService {
    private BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public List<Book> findByBookID(int bookID) {
        return bookRepository.findByBookID(bookID);

    }
}
