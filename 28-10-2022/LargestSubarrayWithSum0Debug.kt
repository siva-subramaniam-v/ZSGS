package zsgs28oct

import java.util.Scanner;

fun subArrayLength(array: IntArray): Int {
    for (i in array.indices) {
        if (array.sliceArray(i until array.size-i).sum() == 0) {
            array.sliceArray(i until array.size-i).forEach {
                print("$it ")
            }
            return array.size-i
        }

        for (j in 1 until i) {
            if (array.sliceArray(j until j+array.size-i).sum() == 0) {
                array.sliceArray(j until j+array.size-i).forEach {
                    print("$it ")
                }
                return array.size-i
            }
        }
    }
    return 0
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter Array Size: ")
    val n = scanner.nextInt()
    val array = IntArray(n)

    print("Enter array elements: ");
    for (i in 0 until n) {
        array[i] = scanner.nextInt()
    }

    scanner.close();
    print("\nLength: ${subArrayLength(array)}")
}