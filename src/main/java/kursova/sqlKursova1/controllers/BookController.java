package kursova.sqlKursova1.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import kursova.sqlKursova1.entities.Book;
import kursova.sqlKursova1.service.BookService;

import java.lang.reflect.Modifier;
import java.util.List;

@Controller
@ControllerAdvice
@AllArgsConstructor
public class BookController {
    private BookService bookService;
    /*@GetMapping("books")
    public String list(Model model) {
        model.addAttribute("result1", bookService.getBooks());
        return "books";
    } */

    @GetMapping("/books")
    public String books(Model model, @RequestParam(name = "book ID", required = false) String bookID) {
        if(bookID == null || "".equals(bookID)) {
            model.addAttribute("result1", bookService.getBooks());
        }else{
            List<Book> books = bookService.findByBookID(Integer.parseInt(bookID));
            model.addAttribute("result1", books);
        }
        return "books";
    }

    @GetMapping("/showNewBookForm")
    public String showNewBookForm(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "newBookForm";
    }

    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Book book){
        bookService.saveBook(book);
        return "redirect:books";
    }

    @GetMapping("/updateBookForm/{id}")
    public String showUpdateBookForm(@PathVariable (value = "id") int id, Model model){
        Book book = bookService.getBookByID(id);
        model.addAttribute("book", book);
        return "updateBookForm";
    }

    @GetMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable (value = "id") int id){
        this.bookService.deleteBookByID(id);
        return "redirect:/books";
    }

}
