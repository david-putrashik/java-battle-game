import java.util.Scanner;
import java.util.Random;
public class Cloude {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введити число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Выберете действие: +, -, *, /.");
        String act = scanner.next();

           if (act.equals("+")) {
               System.out.println("Результат: " + a + " + " + b + " = " + add(a,b));
           } else if (act.equals("-")) {
               System.out.println("Результат: " + a + " - " + b + " = " + subtract(a,b));
           } else if (act.equals("*")) {
               System.out.println("Результат: " + a + " * " + b + " = " + multiply(a,b));
           } else if (act.equals("/")) {
               if (b == 0) {
                   System.out.println("На ноль делить нельзя! ");
               }
           }
    }
    static int add (int a, int b){
        return a + b;
    }
    static int subtract (int a, int b){
        return a - b;
    }
    static int multiply (int a, int b){
        return a * b;
    }
    static double divide (int a, int b){
        if (b == 0){

            return 0;
        }
        return (double) a / b;
    }
}

