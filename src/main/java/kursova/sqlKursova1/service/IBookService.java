package kursova.sqlKursova1.service;

import kursova.sqlKursova1.entities.Book;

import java.util.List;

public interface IBookService {
    List<Book> findByBookID(int bookID);
    void saveBook(Book book) ;
    Book getBookByID(int id);
    void deleteBookByID(int id);
}
