package com.example.graphql;

import java.util.Arrays;
import java.util.List;

/**
 * SURIYA 4/8/2023
 */
public record Author(String id, String firstName, String lastName) {
    private static List<Author> authors = Arrays.asList(
            new Author("author-1", "Joshua", "Bloch"),
            new Author("author-2", "Douglas", "Adams"),
            new Author("author-3", "Bill", "Bryson")
    );

    public static Author getByID(String id) {
        return authors.stream()
                .filter(author -> author.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
