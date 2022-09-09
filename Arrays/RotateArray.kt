import java.util.Scanner

fun leftRotate (array : IntArray, rotationCount : Int) : IntArray{
    var arrayCopy = array.copyOf()

    for (loop in 0 until rotationCount) {
        val start = arrayCopy[0]
        var i = 0

        while (i < arrayCopy.size-1) {
            arrayCopy[i] = arrayCopy[i+1]
            i++
        }

        arrayCopy[arrayCopy.size-1] = start
    }

    return arrayCopy
}

fun rightRotate (array : IntArray, loopCount : Int) : IntArray {
    var arrayCopy = array.copyOf()

    for (loop in 0 until loopCount) {
        val last = arrayCopy[arrayCopy.size-1]
        var i = arrayCopy.size-1

        while (i > 0) {
            arrayCopy[i] = arrayCopy[i-1]
            i--
        }

        arrayCopy[0] = last
    }

    return arrayCopy
}

fun main () {
    val input = Scanner(System.`in`)

    print("Enter the array size: ")
    val size = input.nextInt()
    var array = IntArray(size)

    print("Enter the array elements: ")

    for (i in 0 until size) {
        array[i] = input.nextInt()
    }

    print("\nEnter no of times to left rotate: ")
    val leftRotationCount = input.nextInt()

    print("Left rotated array: ")
    for (element in leftRotate(array, leftRotationCount)) print("$element ")

    print("\n\nEnter no of times to right rotate: ")
    val rightRotationCount = input.nextInt()

    print("Right rotated array: ")
    for (element in rightRotate(array, rightRotationCount)) print("$element ")
}