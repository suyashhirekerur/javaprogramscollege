import java.util.Scanner;

public class sort {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort logic
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Numbers in Ascending Order:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
