package juns.service;

import juns.domain.Book;
import juns.domain.BookRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    // 생성자 주입
    private final BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<Book> findById(Long id){
        return bookRepository.findById(id);
    }
}
