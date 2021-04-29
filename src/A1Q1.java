import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = scan.nextInt();
        System.out.println("Enter 1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division ");
        int operator = scan.nextInt();
        switch (operator) {
            case 1:
                System.out.println(num1 + " + " + num2 +" = "+ (num1+num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 +" = "+ (num1-num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 +" = "+ (num1*num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 +" = "+ ((double)num1/num2));
                break;
        }
    }
}
