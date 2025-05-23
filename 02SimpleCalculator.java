import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        char operator = sc.next().charAt(0);
        double num2 = sc.nextDouble();
        double result = operator == '+' ? num1+num2 :
                       operator == '-' ? num1-num2 :
                       operator == '*' ? num1*num2 : num1/num2;
        System.out.println(result);
    }
}
