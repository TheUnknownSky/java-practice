package MainPackage;

public class Display {
    static void signup_success(){
        System.out.println("Registered Successfully.");
    }
    static void login_failed(){
        System.out.println("Invalid Details.");
    }
    static void login_success(){
        System.out.println("Login Successfully.");
    }
    static void ShowCommand(boolean login_status){
        if (!login_status){
            System.out.println("\n---COMMANDS---");
            System.out.println("1 - Sign Up");
            System.out.println("2 - Login");
        } else {
            System.out.println("\n---COMMANDS---");
            System.out.println("1 - Change Details");
            System.out.println("2 - Logout");
        }
    }
    static void detail_change_choice(){
        System.out.println("\n---CHANGE DETAILS---");
        System.out.println("1 - Username");
        System.out.println("2 - Age");
        System.out.println("3 - Email");
        System.out.println("4 - Password");
    }
    static void wrong_command(){
        System.out.println("Wrong command.");
    }
}
