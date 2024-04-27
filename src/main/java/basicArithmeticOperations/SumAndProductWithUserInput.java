package basicArithmeticOperations;

import java.util.Scanner;

public class SumAndProductWithUserInput {
    public static void main(String[] args) {
        int a, b, sum = 0, product = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first no : ");
        a = scan.nextInt();
        System.out.println("Enter the second no : ");
        b = scan.nextInt();

        sum = a + b;
        product = a * b;

        System.out.println("Sum : " + sum);
        System.out.println("Product : " + product);

    }
}
//    o/p
//    Enter the first no :
//        10
//        Enter the second no :
//        20
//        Sum : 30
//        Product : 200