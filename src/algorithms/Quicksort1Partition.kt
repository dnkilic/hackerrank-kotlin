package algorithms

// Complete the quickSort function below.
fun quickSort(arr: Array<Int>): Array<Int> {
    val first = arr.first()
    val equal = mutableListOf<Int>()
    val left = mutableListOf<Int>()
    val right = mutableListOf<Int>()
    for (i in 0 until arr.size) {
        when {
            arr[i] > first -> right.add(arr[i])
            arr[i] < first -> left.add(arr[i])
            else -> equal.add(arr[i])
        }
    }

    return (left + equal + right).toTypedArray()
}