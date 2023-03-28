package org.homeWorkSeminar6;

import org.homeWorkSeminar6.model.Laptop;
import org.homeWorkSeminar6.model.UserFilter;

import java.util.Set;

import static org.homeWorkSeminar6.model.DataBase.createBase;

public class Example1 {
    public static void main(String[] args) {
        Set<Laptop> base = createBase(10);
        System.out.printf("У нас есть ноутбуки! В наличии %d штук: %n",base.size());
        UserFilter filter = new UserFilter(base);
        while (filter.isUserHere()) {
            filter.askFilter();
        }
    }


}
