import java.util.Arrays;

public class RemoveDuplicates {
    public static void main (String[] args) {
        int[] array = {1, 1, 7, 2, 6, 4, 4, 4, 1, 8, 8, 8};
        Arrays.sort(array);
        
        for (int i=1; i<array.length; i++) {
            // n XOR n equals 0
            if ( ((array[i]) ^ (array[i-1])) != 0) {
                System.out.println(array[i-1]);
            }
        }
        
        System.out.println(array[array.length-1]);
    }
}