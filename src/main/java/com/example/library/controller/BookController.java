package com.example.library.controller;

import com.example.library.dto.response.ResponseDTO;
import com.example.library.dto.response.ResponseListDTO;
import com.example.library.model.Book;
import com.example.library.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResponseListDTO<List<Book>> getBy(@RequestParam(required = false, defaultValue = "") String title,
                                             @RequestParam(required = false, defaultValue = "") String author,
                                             @RequestParam(required = false, defaultValue = "0") int page,
                                             @RequestParam(required = false, defaultValue = "5") int size

    ) {

        Page<Book> pageData = bookService.getAllBy(title, author, page, size);
        return ResponseListDTO.<List<Book>>builder()
                .currentPage(pageData.getNumber())
                .size(pageData.getSize())
                .data(pageData.getContent())
                .totalElements(pageData.getTotalElements())
                .totalPages(pageData.getTotalPages())
                .build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void save(@RequestBody List<Book> books) {
        bookService.saveAll(books);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseDTO<Book> update(@RequestBody Book book) {
        return new ResponseDTO<>(bookService.update(book));
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }
}

