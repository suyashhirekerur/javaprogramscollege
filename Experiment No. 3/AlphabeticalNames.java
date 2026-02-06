import java.util.Scanner;
import java.util.Arrays;

public class AlphabeticalNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];

        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        for (int i = 0; i < 10; i++) {
            System.out.println(names[i]);
        }
    }
}
