import java.util.*;
public class ArraySumAvg {
    public static void main(String[] args) {
        int[] arr = Arrays.stream(new Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum: "+sum+" Avg: "+(double)sum/arr.length);
    }
}
