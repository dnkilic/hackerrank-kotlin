package algorithms

// Complete the equalizeArray function below.
fun equalizeArray(arr: Array<Int>): Int {
    val maxDuplicateEntry = arr.groupBy { it }.maxBy { it.value.size }!!.value.size
    return arr.size - maxDuplicateEntry
}