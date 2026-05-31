public class ThrowWithThrowDemo {

    private static void checkAge(int age) throws Exception{
        if(age<18) throw new ArithmeticException("Age is not Eligible for Voting");
    }
    public static void main(String[] args) {
        try{
            checkAge(13);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
// Age is not Eligible for Voting
