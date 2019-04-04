package algorithms

// Complete the circularArrayRotation function below.
fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
    val shiftedArray = IntArray(a.size)
    for (i in a.indices) {
        if (i + k >= a.size) {
            shiftedArray[(i + k) % a.size] = a[i]
        } else {
            shiftedArray[i + k] = a[i]
        }
    }

    val queriedArray = IntArray(queries.size)
    for (i in queries.indices) {
        queriedArray[i] = shiftedArray[queries[i]]
    }

    return queriedArray.toTypedArray()
}