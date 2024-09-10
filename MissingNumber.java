import java.util.Scanner;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        // Compute sum of first n natural numbers
        int expectedSum = n * (n + 1) / 2;
        
        // Compute sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // The missing number is the difference between the expected and actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array (n-1) and hence the range n
        int n = scanner.nextInt();
        int[] arr = new int[n - 1];

        // Read the elements of the array
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find and print the missing number
        System.out.println(findMissingNumber(arr, n));
        
        scanner.close();
    }
}
