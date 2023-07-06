package com.weCode.bookStore.controller;

import com.weCode.bookStore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getBook(String bookId) {
        BookDto book = BookDto.builder().title("1001 night !").build();
        List<BookDto> books = new ArrayList<>();
        books.add(book);
        return ResponseEntity.ok(books);
    }
}
