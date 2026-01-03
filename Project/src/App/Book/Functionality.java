package App.Book;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Functionality {
    // add
    // update
    // delete
    // search(by title,author,category)
    // view all books
    // view only available books
    public void addBook() {
        Book book = new Book();

        HashMap<String, String> bookname = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book Name\nPress Enter to Exit");
        String str = sc.nextLine();
        while (true) {
            if (str.equals(" ")) {
                return;
            } else {
                try {
                    book.setTitle(str);
                    String title = book.getTitle();
                    System.out.println("Enter the Author Name");
                    book.setAuthor(sc.nextLine());
                    String authorName = book.getAuthor();
                    bookname.put(title, authorName);
                    System.out.println("_______________Book added Succesfully_____________");

                } catch (InputMismatchException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Update
    public void update() {

    }
}
