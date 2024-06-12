package com.example.library.service.book.imp;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import com.example.library.service.book.IBookService;
import jakarta.annotation.PostConstruct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @PostConstruct
    public void init() {
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction", 15.99));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Classics", 12.99));
        books.add(new Book("1984", "George Orwell", 1949, "Dystopian", 10.99));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951, "Coming-of-Age", 14.99));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813, "Romance", 11.99));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937, "Fantasy", 18.99));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997, "Fantasy", 20.99));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, "Fantasy", 25.99));
        books.add(new Book("Moby-Dick", "Herman Melville", 1851, "Adventure", 17.99));
        books.add(new Book("Brave New World", "Aldous Huxley", 1932, "Dystopian", 16.99));

        bookRepository.saveAll(books);

    }

    @Transactional
    public void save(Book newBook) {
        bookRepository.save(newBook);
    }

    @Transactional
    public void saveAll(List<Book> newBooks) {

        bookRepository.saveAll(newBooks);
    }

    @Transactional
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }


    public Page<Book> getAllBy(String title, String author, int page, int size) {
        Page<Book> result = bookRepository.findByTitleOrAuthor(title, author, PageRequest.of(page, size));

        result.forEach(System.out::println);

        if (result.isEmpty()) {
            return bookRepository.findAll(PageRequest.of(page, size, Sort.by(Sort.Direction.ASC, "title")));
        }
        return result;
    }


    public Book update(Book book) {
        Optional<Book> bookInStorage = bookRepository.findById(book.getId());

        if (bookInStorage.isEmpty()) {
            throw new RuntimeException("User with this id not found!");
        }
        return bookRepository.save(book);


    }
}
