package algorithms

// Complete the lonelyinteger function below.
fun lonelyInteger(a: Array<Int>): Int {
    val map = a.groupBy { it }
    return if (map.size == 1) {
        map.keys.single()
    } else {
        map.filter { it.value.size == 1 }.keys.single()
    }
}