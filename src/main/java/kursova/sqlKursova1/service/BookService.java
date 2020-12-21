package kursova.sqlKursova1.service;

import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kursova.sqlKursova1.entities.Book;
import kursova.sqlKursova1.repositories.BookRepository;

@Service
@AllArgsConstructor
public class BookService implements IBookService{

    private BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> findByBookID(int bookID) {
        return bookRepository.findByBookID(bookID);
    }

    @Override
    public void saveBook(Book book){
        this.bookRepository.save(book);
    }

    @Override
    public Book getBookByID(int id){
        System.out.println(id);
        Optional<Book> optional = bookRepository.findById(id);

        Book book = null;
        if(optional.isPresent()){
            book = optional.get();
        }
        else{
            throw new RuntimeException(" Book not found ");
        }
        return book;
    }
    @Override
    public void deleteBookByID(int id){
        this.bookRepository.deleteById(id);
    }

}
