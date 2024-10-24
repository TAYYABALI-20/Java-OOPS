import java.util.Scanner;

public class TableOfNumber {

    public static void main(String[] args) {

        // Number By User Input

        Scanner number = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = number.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        //Number Hard Coded
        
        // int number = 5;

        // for(int i = 1; i <= 10; i++) {
        //     System.out.println(number + " * " + i + " = " + (number * i));
        // }

    }
    
}