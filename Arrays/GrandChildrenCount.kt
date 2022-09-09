fun grandChildrenCount (familyTree : Array<Array<String>>, name : String) : Int {
    var count = 0

    for (pair in familyTree) {
        if (pair[1] == name) {
            val child = pair[0]

            for (pair_ in familyTree) {
                if (pair_[1] == child)
                    count++
            }
        }
    }
    return count
}

fun main () {
    val familyTree = arrayOf(arrayOf("luke", "shaw"), arrayOf("wayne", "rooney"), arrayOf("rooney", "ronaldo"), arrayOf("shaw", "rooney"))

    print("Enter the name: ")
    val name = readLine()!!

    print("$name has ${grandChildrenCount(familyTree, name)} grandchildren")
}