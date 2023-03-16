package org.homeWorkSeminar3.homeTask2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Product {
    String nameProduct;
    String country;
    Double weight;
    Double price;
    Integer sort;
}
