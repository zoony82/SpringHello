package juns.domain;

//import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    BookRepository repository;

    @Test
    public void testSave(){
        Book book = new Book();
        book.setName("springBoot_book");
        book.setAttr1("2019");
        book.setAttr2("jjh");

        assertEquals("2019",book.getAttr1());
        assertEquals("jjh",book.getAttr2());

        repository.save(book);

    }

    @Test
    public void testfindNameLike(){
        Book book = new Book();
        book.setName("springBoot_book");
        book.setAttr1("2019");
        book.setAttr2("jjh");

        repository.save(book);

        List<Book> books = repository.findByNameLike("spring%");
//        assertThat(books).isNotEmpty;
        System.out.println("end");

    }
}
