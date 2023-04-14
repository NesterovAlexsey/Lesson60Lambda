//Используйте класс Book (книга) из домашнего задания к уроку 45 (см. Book.java).
//
//Создайте список книг и отсортируйте книги по названию,
// (при одинаковых названиях - по автору) при помощи лямбда-функции.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookList {

  public static void main(String[] args) {

    List<Book> myBestBook = new ArrayList<>();
    myBestBook.add(new Book("Remark", "Three friends", 200));
    myBestBook.add(new Book("Stevin Kowi", "7 Effective skills", 300));
    myBestBook.add(new Book("Достоевский", "Братья Карамазовы", 680));
    myBestBook.add(new Book("Remark", "No change on the western front", 300));

    myBestBook.sort((Book o1, Book o2) -> {
      if (o1.getBookName().compareTo(o2.getBookName()) < 0) {
        return -1;
      }
      if (o1.getBookName().compareTo(o2.getBookName()) > 0) {
        return 1;
      }
      return o1.getAuthor().compareTo(o2.getAuthor());
    });

    for (Book book : myBestBook) {
      System.out.println(book);
    }

  }

}
