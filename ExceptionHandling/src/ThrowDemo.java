import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age= sc.nextInt();


        if(age<18) throw new ArithmeticException("Not ready for voting");

        System.out.println("Ready for Voting");
    }
}
