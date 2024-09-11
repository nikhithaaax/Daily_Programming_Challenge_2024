import java.util.Scanner;

public class findduplicate {
    public static int findDuplicate(int[] arr) {
        // Step 1: Initialize tortoise and hare to the first element
        int tortoise = arr[0];
        int hare = arr[0];

        // Step 2: Move tortoise by 1 step and hare by 2 steps until they meet
        do {
            tortoise = arr[tortoise];
            hare = arr[arr[hare]];
        } while (tortoise != hare);

        // Step 3: Move one pointer to the start of the array
        tortoise = arr[0];

        // Step 4: Move both pointers one step at a time until they meet
        while (tortoise != hare) {
            tortoise = arr[tortoise];
            hare = arr[hare];
        }

        // Step 5: The meeting point is the duplicate number
        return hare;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading input size
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        // Reading the array elements
        for (int i = 0; i < n + 1; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding and printing the duplicate number
        System.out.println(findDuplicate(arr));
    }
}
