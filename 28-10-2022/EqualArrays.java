import java.util.Scanner;
import java.util.HashMap;

public class EqualArrays {
    private void populateMap(HashMap<Integer, Integer> map, int[] array) {
        for (int element : array) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
    }

    private boolean areEqual(int[] array1, int[] array2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        populateMap(map1, array1);
        populateMap(map2, array2);

        for (Integer element : map1.keySet()) {
            if (!map2.containsKey(element) || map1.get(element) != map2.get(element))
                return false;
        }

        return true;
    }

    void getArrays() {
        int[] array1, array2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = scanner.nextInt();

        System.out.print("Enter elements of first array: ");
        array1 = new int[n];

        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter elements of second array: ");
        array2 = new int[n];

        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }

        scanner.close();

        if (areEqual(array1, array2))
            System.out.println("\nEqual");
        else
            System.out.println("\nNot Equal");
    }

    public static void main(String[] args) {
        EqualArrays equalArrays = new EqualArrays();
        equalArrays.getArrays();
    }
}