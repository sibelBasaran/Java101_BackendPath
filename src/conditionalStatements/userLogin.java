package conditionalStatements;
import java.util.Scanner;
public class userLogin {
    public static void main(String[] args) {
        String username,password;

        Scanner input = new Scanner(System.in);
        System.out.println("Username: ");
        username = input.nextLine();
        System.out.println("Password: ");
        password = input.nextLine();

        if(username.equals("patika")&&password.equals("java123")){
            System.out.println("You login successfully!");

        }else {
            System.out.println("Your username or password is incorrect!");
            System.out.println("Reset password. Y/N ?");
            String respond = input.nextLine();
        switch (respond){
            case "Y":
                System.out.println("Enter your new password: ");
                String newPass = input.nextLine();
                if(newPass.equals("java123")){
                    System.out.println("Your password cannot be the same as your old password.");
                }else{
                    System.out.println("Your password has been successfully updated!\nPlease login.");
                    break;
                }
            case "N":
                System.out.println("Please try again..");

        }
        }
    }
}
