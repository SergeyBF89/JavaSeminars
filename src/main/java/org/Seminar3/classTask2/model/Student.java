package org.Seminar3.classTask2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor

public class Student {
    private String surName;
    private int numberGroup;
    private double scholarship;
    private List<Integer> scoresItems;
}
