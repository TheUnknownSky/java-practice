package MainPackage;
import java.util.Scanner;
public class Runner {
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
        Player player1 = new Player();
        int choice = 1;
        boolean login_status = false;
        while (choice > 0 && choice < 3) {
            Display.ShowCommand(login_status);
            choice = getInt("Enter choice: ");
            if (!login_status){
                switch (choice) {
                    case 1:
                        player1.signup(
                                getString("\nEnter username: "),
                                getString("Enter age: "),
                                getString("Enter email: "),
                                getString("Enter password: ")
                        );
                        break;
                    case 2:
                        while (!(player1.login(
                                getString("\nEnter valid username: "),
                                getString("Enter valid password: ")
                        )));
                        login_status = true;
                        break;
                    default:
                        Display.wrong_command();
                        break;
                }
            } else {
                switch (choice) {
                    case 1:
                        Display.detail_change_choice();
                        int change_choice = getInt("Enter choice: ");
                        switch (change_choice){
                            case 1:
                                player1.change_details(change_choice, getString("Change username: "));
                                break;
                            case 2:
                                player1.change_details(change_choice, getString("Change age: "));
                                break;
                            case 3:
                                player1.change_details(change_choice, getString("Change email: "));
                                break;
                            case 4:
                                player1.change_details(change_choice, getString("Change password: "));
                                break;
                            default:
                                Display.wrong_command();
                        }
                        break;
                    case 2:
                        login_status = player1.logout();
                        break;
                    default:
                        Display.wrong_command();
                        break;
                }
            }
        }
    }
}
