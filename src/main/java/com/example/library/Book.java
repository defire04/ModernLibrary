package com.example.library;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Book {
    private String title;
    private String author;
    private double price;
}