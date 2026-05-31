import java.util.Scanner;

public class ThrowWithThrowDemo {

    private static void checkAge(int age) throws Exception{
        if(age<18) {
            throw new ArithmeticException("Age is not Eligible for Voting");
        }

        System.out.println("Eligible");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Age :");

        int age = sc.nextInt();

        try{
            checkAge(age);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

