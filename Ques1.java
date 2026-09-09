import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int greater;

        if (a >= b && a >= c) {
            greater = a;
        } else if (b >= a && b >= c) {
            greater = b;
        } else {
            greater = c;
        }

        System.out.println("Greater number = " + greater);
    }
}
