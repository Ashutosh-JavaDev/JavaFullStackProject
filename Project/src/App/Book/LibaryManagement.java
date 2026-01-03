package App.Book;
import java.util.InputMismatchException;
import java.util.Scanner;

class LibaryManagement {
    public void allFunction() {

        Functionality function = new Functionality();

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "---------------------------_____________Press Enter to Start_____________-------------------------");
        String str = sc.nextLine();

        while (true) {

            System.out.println(
                    "Press Enter to Stop\nPress 1.To Add\nPress 2. To Update\nPress 3. To Delete\nPress 4. To Search\nPress 5. To View all Book\nPress 6. To View Available Books");
            if (str.equals(" ")) {
                return;
            } else {
                try {
                    int num = Integer.parseInt(str);
                    switch (num) {
                        case 1:
                            function.addBook();
                            while (true) {
                                System.out.println(
                                        "Press Enter to Stop\nPress 2. To Update\nPress 3. To Delete\nPress 4. To Search\nPress 5. To View all Book\nPress 6. To View Available Books");
                                String choose = sc.nextLine();
                                if (choose.equals(" ")) {
                                    return;
                                } else {
                                    int choice = Integer.parseInt(choose);
                                    switch (choice) {
                                        case 2:
                                            function.remove();
                                            break;
                                        case 3:
                                            function.update();
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
                                            System.out.println("Choice Error");
                                            break;
                                    }
                                }

                            }

                        default:
                            System.out.println("Libary is empty,add Book First");
                            break;
                    }
                } catch (InputMismatchException e) {

                    e.printStackTrace();
                }
            }
        }

    }
}
