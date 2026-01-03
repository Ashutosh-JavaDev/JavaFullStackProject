package App;

import java.util.Scanner;
import App.Book.Functionality;

public class LibaryManagement {

    public void allFunction() {

        Functionality function = new Functionality();
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "--------------------------- Press Enter to Start ---------------------------");
        sc.nextLine(); // wait for Enter

        while (true) {
            System.out.println(
                    "\nPress Enter to Stop\n" +
                    "Press 1. To Add\n" +
                    "Press 2. To Update\n" +
                    "Press 3. To Delete\n" +
                    "Press 4. To Search\n" +
                    "Press 5. To View all Book\n" +
                    "Press 6. To View Available Books"
            );

            String input = sc.nextLine().trim();

            // Exit condition
            if (input.isEmpty()) {
                System.out.println("Program stopped.");
                return;
            }

            // Validate numeric input
            if (!input.matches("\\d+")) {
                System.out.println("Invalid input. Enter a number.");
                continue;
            }

            int num = Integer.parseInt(input);

            switch (num) {
                case 1:
                    function.addBook();
                    break;
                case 2:
                    function.update();
                    break;
                case 3:
                    function.remove();
                    break;
                case 4:
                    function.search();
                    break;
                case 5:
                    function.view();
                    break;
                case 6:
                    function.viewAvailable();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
