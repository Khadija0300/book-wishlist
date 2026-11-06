
package com.example.bookwishlist.controller;

import com.example.bookwishlist.model.WishlistBook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<WishlistBook> getBooks() {

        WishlistBook book1 = new WishlistBook(
                1L,
                "Schuld und Sühne",
                "Fjodor Dostojewski",
                "Klassiker",
                "Hoch",
                false
        );

        WishlistBook book2 = new WishlistBook(
                2L,
                "Der Prozess",
                "Franz Kafka",
                "Klassiker",
                "Mittel",
                false
        );

        return List.of(book1, book2);
    }
}
