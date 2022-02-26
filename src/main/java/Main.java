import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Input: ");
            String inputValue = input.next();
            if (inputValue.equals("add")){
                int a = input.nextInt();
                int b = input.nextInt();
                int c = calculator.add(a, b);
                System.out.println("Output: " + c);
            }
            else if (inputValue.equals("subtract")){
                int a = input.nextInt();
                int b = input.nextInt();
                int c = calculator.subtract(a, b);
                System.out.println("Output: " + c);
            }
            else if (inputValue.equals("multiply")){
                int a = input.nextInt();
                int b = input.nextInt();
                int c = calculator.multiply(a, b);
                System.out.println("Output: " + c);
            }
            else if (inputValue.equals("divide")){
                int a = input.nextInt();
                int b = input.nextInt();
                int c = calculator.divide(a, b);
                System.out.println("Output: " + c);
            }
            else if (inputValue.equals("fibonacciNumberFinder")){
                int a = input.nextInt();
                int c = calculator.fibonacciNumberFinder(a);
                System.out.println("Output: " + c);
            }
            else if (inputValue.equals("intToBinaryNumber")){
                int a = input.nextInt();
                String c = calculator.intToBinaryNumber(a);
                System.out.println("Output: " + c);
            }
            else if (inputValue.equals("createUniqueID")){
                String a = input.next();
                String c = calculator.createUniqueID(a);
                System.out.println("Output: " + c);
            }

        }
    }
}
