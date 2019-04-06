package juns.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

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
        assertEquals("jjh2",book.getAttr2());

    }
}
