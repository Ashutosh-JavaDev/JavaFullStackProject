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
    public void addBook(HashMap<String, String> bookname) {
        bookname = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book Name\nPress Enter to Exit");
        String str = sc.nextLine();
        while (true) {
            if (str.equals(" ")) {
                return;
            } else {
                try {
                    System.out.println("Enter the Author Name");
                    String authorName=sc.nextLine();
                    bookname.put(str,authorName);

                } catch (InputMismatchException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
