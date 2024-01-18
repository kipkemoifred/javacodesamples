package tutorials.exceptions;

public class ExceptionsExamples extends Exception{
    public static void main(String[] args) throws Exception{
//        throw new Exception();
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong." +e);
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
//        checkAge(15);
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }

    }
}