import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        int marks = new Scanner(System.in).nextInt();
        System.out.println(marks>=90?"A":marks>=80?"B":marks>=70?"C":marks>=60?"D":"F");
    }
}
