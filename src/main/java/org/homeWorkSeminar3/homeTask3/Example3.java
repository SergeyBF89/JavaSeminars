package org.homeWorkSeminar3.homeTask3;

import org.homeWorkSeminar3.homeTask3.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        Book book1 = new Book("Таинственный остров", "Жюль", 500.0, 2009, 700);
        Book book2 = new Book("Война и мир", "Толстой", 2000.0, 2010, 1300);
        Book book3 = new Book("Три толстяка", "Олеша", 375.99, 2017, 17);
        Book book4 = new Book("1Q84", "Мураками", 450.0, 2011, 97);
        Book book5 = new Book("Мастер и Маргарита", "Булгаков", 700.99, 1966, 863);
        Book book6 = new Book("Шардик", "Адамс", 600.0, 2010, 751);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);

        StringBuilder sortBooks = new StringBuilder();
        for (Book book : bookList) {
            if (isPrime(book.getAmountPages()) && book.getSurnameAuthor().toLowerCase().contains("а")
                && book.getYearEdition() >= 2010 && book.getYearEdition() < 2023) {
                sortBooks.append(book.getNameBook()).append("\n");
            }
        }
        System.out.println(sortBooks);

    }

    /**
     * @param number число страниц
     * @return простое число страниц или нет
     */
    private static boolean isPrime (int number) {

        Double sq = Math.sqrt(number);
        for (int i = 2; i <= sq.intValue(); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
