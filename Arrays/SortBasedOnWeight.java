import java.util.Scanner;

class SortBasedOnWeight {
    
    static void sort (int[] array, int firstPosition, int secondPosition) {
        int temp = array[firstPosition];
        array[firstPosition] = array[secondPosition];
        array[secondPosition] = temp;
    }

    static void printSortedPairs (int[] array, int[] weights) {
        boolean isSorted;

        for (int i=0; i<weights.length-1; i++) {
            isSorted = true;

            for (int j=1; j<weights.length-i; j++) {

                if (weights[j] > weights[j-1]) {
                    isSorted = false;
                    
                    sort(array, j, j-1);
                    sort(weights, j, j-1);
                }

                if (weights[j] == weights[j-1]) {
                    if (array[j] > array[j-1]) {
                        sort(array, j, j-1);
                        sort(weights, j, j-1);
                    }
                }
            }

            if (isSorted)
                break;
        }

        for (int i=0; i<array.length; i++) {
            System.out.print("<" + array[i] + ", " + weights[i] + "> ");
        }
    }


    static void calculateWeights (int[] array) {
        int[] weights = new int[array.length];

        for (int i=0; i<array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0)
                weights[i] += 5;
            
            if ((array[i] % 4 == 0) && (array[i] % 6 == 0) )
                weights[i] += 4;
            
            if (array[i] % 2 == 0)
                weights[i] += 3;
        }

        printSortedPairs(array, weights);
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the no of elements: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.print("\nEnter the array elements: ");
        
        for (int i=0; i<size; i++)
            array[i] = input.nextInt();

        input.close();

        calculateWeights(array);
    }
}