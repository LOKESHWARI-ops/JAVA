import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine().toLowerCase().replaceAll("[^a-z0-9]","");
        System.out.println(s.equals(new StringBuilder(s).reverse().toString())?"Palindrome":"Not Palindrome");
    }
}
