import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scan.nextInt();
        int fact = 1;
        int i = 1;
        do {
            fact *= i;
            i++;
        } while(i <= num);
        System.out.println(num+ "! = "+ fact);
    }
}
