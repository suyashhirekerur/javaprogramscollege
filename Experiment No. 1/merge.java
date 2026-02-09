import java.util.Scanner;

public class merge {
    public static void main(String[] args) {

        int n1, n2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        n1 = sc.nextInt();

        System.out.print("Enter size of second array: ");
        n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] merged = new int[n1 + n2];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int i = 0, j = 0, k = 0;

        // Merging logic
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        System.out.println("Merged Sorted Array:");
        for (int x = 0; x < n1 + n2; x++) {
            System.out.print(merged[x] + " ");
        }

        sc.close();
    }
}
