package zsgs28oct

import java.util.Scanner;

fun firstOccurringElement(array: IntArray, minimumOccurrence: Int) {
    val map = mutableMapOf<Int, Int>()

    array.forEach {
        map[it] = map[it]?.plus(1) ?: 1

        if (map[it] == minimumOccurrence) {
            print(it)
            return
        }
    }

    print("No element occurs $minimumOccurrence times")
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

    print("Enter minimum count: ");
    val minCount = scanner.nextInt()

    firstOccurringElement(array, minCount)
    scanner.close();
}