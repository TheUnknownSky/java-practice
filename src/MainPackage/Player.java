package MainPackage;

public class Player {
    private String username;
    private int age;
    private String email;
    private String password;
    public void signup(String username, String age, String email, String password){
        this.username = username;
        this.age = Integer.parseInt(age);
        this.email = email;
        this.password = password;
        Display.signup_success();
    }
    public boolean login(String username, String password){
        if (!this.username.equals(username) || !this.password.equals(password)){
            Display.login_failed();
            return false;
        } else {
            Display.login_success();
            return true;
        }
    }
    public void change_details(int choice, String to_be_changed){
        switch (choice){
            case 1:
                System.out.println("'" + this.username + "' to be changed into: " + to_be_changed);
                this.username = to_be_changed;
                break;
            case 2:
                System.out.println("'" + this.age + "' to be changed into: " + to_be_changed);
                this.age = Integer.parseInt(to_be_changed);
                break;
            case 3:
                System.out.println("'" + this.email + "' to be changed into: " + to_be_changed);
                this.email = to_be_changed;
                break;
            case 4:
                System.out.println("'" + this.password + "' to be changed into: " + to_be_changed);
                this.password = to_be_changed;
                break;
        }
    }
    public boolean logout(){
        return false;
    }
}
