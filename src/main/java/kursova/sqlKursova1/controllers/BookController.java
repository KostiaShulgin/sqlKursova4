package kursova.sqlKursova1.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import kursova.sqlKursova1.entities.Book;
import kursova.sqlKursova1.service.BookService;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookController {
    private BookService bookService;

    /*@GetMapping("books")
    public String list(Model model) {
        model.addAttribute("result1", bookService.getBooks());
        return "books";
    } */

    @GetMapping("books")
    public String books(Model model, @RequestParam(name = "book ID", required = false) String bookID) {
        if(bookID == null || "".equals(bookID)) {
            model.addAttribute("result1", bookService.getBooks());
        }else{
            List<Book> books = bookService.findByBookID(Integer.parseInt(bookID));
            model.addAttribute("result1", books);
        }
        return "books";
    }
}
