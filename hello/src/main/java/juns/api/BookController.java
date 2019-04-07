package juns.api;

import juns.domain.Book;
import juns.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> findById(Long bookId){
        Book book = bookService.findById(bookId).orElseThrow(() -> new RuntimeException("Not found : " + bookId));
        return ResponseEntity.ok(book);

    }
}
