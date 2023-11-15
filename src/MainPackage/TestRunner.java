package MainPackage;

import java.util.Scanner;

public class TestRunner {
    public static Scanner scan = new Scanner(System.in);
    public static String getString(String prompt){
        System.out.print(prompt);
        return scan.next();
    }
    public static int getInt(String prompt){
        System.out.print(prompt);
        return scan.nextInt();
    }

    public static void main(String[] args) {
        Player player2 = new Player();
        int choice = 1;
        while (choice > 0 && choice < 3){
            Display.ShowCommand(false);
            choice = getInt("Enter choice: ");
            switch (choice) {
                case 1:
                    player2.signup(
                            getString("\nEnter username: "),
                            getString("Enter age: "),
                            getString("Enter email: "),
                            getString("Enter password: ")
                    );
                    break;
                case 2:
                    while (!(player2.login(
                            getString("\nEnter valid username: "),
                            getString("Enter valid password: ")
                    )));
                    break;
                default:
                    Display.wrong_command();
                    break;
            }
        }
    }
}
