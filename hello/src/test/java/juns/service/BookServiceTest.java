package juns.service;

import juns.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.text.html.Option;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class BookServiceTest {

    @Autowired
    BookService bookService;

    @Test(expected = RuntimeException.class)
    public void testFindById(){
        Long id = 1L;
        Book book = bookService.findById(id).orElseThrow(() -> new RuntimeException("Not Found!!!"));
    }
}
