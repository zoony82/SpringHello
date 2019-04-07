package juns.service;

import juns.domain.Book;

import java.util.Optional;

public interface BookService {

    Optional<Book> findById(Long id);
}
