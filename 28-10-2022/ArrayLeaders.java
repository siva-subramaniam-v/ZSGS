import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLeaders {
    void printLeaders(int[] array) {
        ArrayList<Integer> leaders = new ArrayList<>();

        outerloop: for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i])
                    continue outerloop;
            }
            leaders.add(array[i]);
        }

        for (Integer leader : leaders) {
            System.out.print(leader + " ");
        }
    }

    void getArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = scanner.nextInt();

        System.out.print("Enter array elements: ");
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        printLeaders(array);
    }

    public static void main(String[] args) {
        ArrayLeaders leaders = new ArrayLeaders();
        leaders.getArray();
    }
}