import java.util.Scanner

fun reArrange (array : IntArray) {
    var index = if (array.size %2 != 0) array.size/2 else (array.size/2) - 1
    var i = 1
    array.sort()

    while (i <= array.size) {
        print("${array[index]} ")
        index = if (i %2 != 0 ) index+i else index-i
        i++
    }
}

fun main () {
    val input = Scanner(System.`in`)

    print("Enter the no of elements in the array: ")
    val size = input.nextInt();

    var array = IntArray(size)

    print("Enter the array elements: ")
    for (index in 0 until size)
        array[index] = input.nextInt()

    input.close()

    reArrange(array)
}