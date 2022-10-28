package zsgs28oct

import java.util.Scanner;

fun areAnagramPairs(string1: String, string2: String): Boolean {
    val map1 = mutableMapOf<Char, Int>()
    val map2 = mutableMapOf<Char, Int>()

    string1.forEach {
        map1[it] = map1[it]?.plus(1) ?: 1
    }

    string2.forEach {
        map2[it] = map2[it]?.plus(1) ?: 1
    }

    map1.keys.forEach {
        if (!map2.keys.contains(it) || map2[it] != map1[it])
            return false
    }

    return true;
}

fun singleDigitAnagramCount(string: String): Int {
    var singleCount = 0

    print("\nSingle anagram pairs: ")
    for (i in string.indices) {
        for (j in i + 1 until string.length) {
            if (string[i] == string[j]) {
                print("[${string[i]} , ${string[j]}] ")
                singleCount++
            }
        }
    }
    println("\n")

    return singleCount
}

fun variableDigitAnagramCount(string: String): Int {
    var variableCount = 0

    for (variableDigit in 2 until string.length) {
        var list = mutableListOf<String>()

        for (subStringStartIndex in 0 .. string.length - variableDigit) {
            list.add(string.substring(subStringStartIndex, subStringStartIndex + variableDigit))
            println("variable length $variableDigit: ${string.substring(subStringStartIndex, subStringStartIndex + variableDigit)}")
        }

        println()

        for (index in 0 until list.size) {
            for (subIndex in index+1 until list.size) {
                if (areAnagramPairs(list[index], list[subIndex])) {
                    println("Anagram pair: [${list[index]} == ${list[subIndex]}]")
                    variableCount += 1
                } else {
                    println("Non-anagram pair: [${list[index]} != ${list[subIndex]}]")
                }
            }
        }

        println()
    }

    return variableCount
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of testcases: ")
    var testcaseCount = scanner.nextInt()

    for (testcase in 0 until testcaseCount) {
        var mainAnagramCount = 0

        print("Enter the string: ")
        var string = scanner.next()

        mainAnagramCount += singleDigitAnagramCount(string)

        if (string.length > 1)
            mainAnagramCount += variableDigitAnagramCount(string)

        println("count: $mainAnagramCount \n")
    }
}