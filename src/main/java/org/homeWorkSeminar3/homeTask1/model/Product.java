package org.homeWorkSeminar3.homeTask1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Product {
    private String nameProduct;
    private Double price;
    private Integer sort;
}
