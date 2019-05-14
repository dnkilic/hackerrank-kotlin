package algorithms

// Complete the countingSort function below.
fun countingSort2(arr: Array<Int>): Array<Int> {
    val map = arr.groupBy { it }
    val result = mutableListOf<Int>()
    for (i in 0 until 100) {
        if (map.containsKey(i)) {
            result.addAll(map.getValue(i))
        }
    }

    return result.toTypedArray()
}