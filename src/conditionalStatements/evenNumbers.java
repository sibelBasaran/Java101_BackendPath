package conditionalStatements;
import java.util.Scanner;

public class evenNumbers {
    public static void main(String[] args) {
        int k;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        k = input.nextInt();

      /*  for(int i=1;i<=k;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        } */
        int i=1;
        while (i<=k){
            if(i % 2 == 0){
                System.out.println(i+",");
            }
            i++;
        }
    }
}
