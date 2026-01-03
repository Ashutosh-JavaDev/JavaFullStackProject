import App.Book.Functionality;

import java.util.InputMismatchException;
import java.util.Scanner;
public class LibaryManagement {
    public static void main(String[] args) {
        Functionality function = new Functionality();

        Scanner sc=new Scanner(System.in);
        System.out.println("---------------------------_____________Press Enter to Start_____________-------------------------");
        String str=sc.nextLine();
        
        while (true) {
            
            System.out.println(
                    "Press Enter to Stop\nPress 1.To Add\nPress 2. To Update\nPress 3. To Delete\nPress 4. To Search\nPress 5. To View all Book\nPress 6. To View Available Books");
                    if(str.equals(" ")){
                        return;
                    }
                    else{
                        try {
                            int num=Integer.parseInt(str);
                            switch(num){
                                case 1:
                                function.addBook();
                                System.out.println(
                                    "Press 2. To Update\nPress 3. To Delete\nPress 4. To Search\nPress 5. To View all Book\nPress 6. To View Available Books");
                                    int choose=sc.nextInt();
                                    switch (choose) {
                                        case 2:
                                            
                                            break;
                                    
                                        default:
                                            break;
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
