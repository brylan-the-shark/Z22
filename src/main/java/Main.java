// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = scanner.nextInt();
    int[] numbers = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }
    int max = maxValue(numbers);
    System.out.println("The biggest number is: " + max);
    scanner.close();
  }

  private static int maxValue(int[] nums) {
    int max = nums[0];
    for (int ktr = 0; ktr < nums.length; ktr++) {
      if (nums[ktr] > max) {
        max = nums[ktr];
      }
    }
    return max;
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}