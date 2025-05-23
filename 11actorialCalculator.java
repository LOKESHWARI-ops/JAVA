import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        long fact = 1;
        for(int i=1;i<=n;fact*=i++);
        System.out.println(fact);
    }
}
