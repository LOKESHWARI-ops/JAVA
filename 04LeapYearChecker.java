import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        System.out.println((year%400==0)||(year%4==0&&year%100!=0)?"Leap Year":"Not Leap Year");
    }
}
