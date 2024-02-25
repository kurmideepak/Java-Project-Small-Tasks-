import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b){
        return a+b;
    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static double div(double a, double b){
        if (b!=0){
            return a/b;
        }
        else{
            System.out.println("Error, Cannot divide by zero");
            return Double.NaN;
        }
        }
        public static double mul(double a, double b){
        return a*b;
        }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();

        System.out.println("Enter the operation (+, -, /, *):  ");
        char operation = sc.next().charAt(0);
        double result;
        switch (operation){
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = sub(a,b);
                break;
            case '/':
                result = div(a,b);
                break;
            case '*':
                result = mul(a,b);
                break;
            default:
                System.out.println("Error: Unsupported operation.");
                return;
        }
        System.out.println("Result: "+ result);
    }
    }

