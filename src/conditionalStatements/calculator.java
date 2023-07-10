package conditionalStatements;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int num1,num2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1.number: ");
        num1 = input.nextInt();
        System.out.println("Enter 2.number: ");
        num2 = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplicatin\n4-Division");
        System.out.println("Select your choose: ");
        int select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Addition:"+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction:"+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication:"+(num1*num2));
                break;
            case 4:
                if (num2 !=0){
                System.out.println("Division:"+(num1/num2));
                }else{
                    System.out.println("Number cannot be divided by zero");
                }
                break;
            default:
                System.out.println("Wrong choice!");
        }

    }
}
