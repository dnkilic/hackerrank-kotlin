package datastructures

fun leftRotation(n: Int, leftRotations: Int, arr: Array<Int>) {

    val rotation = leftRotations % n
    val map = mutableMapOf<Int, Int>()
    for (i in arr.indices) {
        if (i >= rotation) {
            map[i - rotation] = arr[i]
        } else {
            map[(n - rotation + i)] = arr[i]
        }
    }

    val list = map.toSortedMap().values.toMutableList()
    for (i in list.indices) {
        if (i == 0) {
            print(list[i])
        } else {
            print(" ${list[i]}")
        }
    }
}