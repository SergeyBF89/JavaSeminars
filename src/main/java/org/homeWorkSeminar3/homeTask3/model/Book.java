package org.homeWorkSeminar3.homeTask3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String nameBook;
    private String surnameAuthor;
    private Double priceBook;
    private Integer yearEdition;
    private Integer amountPages;
}
