package com.example.library.service.book;

import com.example.library.model.Book;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IBookService {

    /**
     * Save a new book to the repository.
     *
     * @param newBook the book to be saved
     */
    void save(Book newBook);

    /**
     * Save a list of new books to the repository.
     *
     * @param newBooks the list of books to be saved
     */
    void saveAll(List<Book> newBooks);

    /**
     * Delete a book from the repository by its ID.
     *
     * @param id the ID of the book to be deleted
     */
    void delete(Long id);

    /**
     * Get a paginated list of books filtered by title or author.
     *
     * @param title  the title to filter by
     * @param author the author to filter by
     * @param page   the page number to retrieve
     * @param size   the number of records per page
     * @return a page of books matching the filter criteria
     */
    Page<Book> getAllBy(String title, String author, int page, int size);

    /**
     * Update an existing book in the repository.
     *
     * @param book the book with updated details
     * @return the updated book
     */
    Book update(Book book);
}
