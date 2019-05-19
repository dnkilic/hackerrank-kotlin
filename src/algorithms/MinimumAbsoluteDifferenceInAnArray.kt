package algorithms

// Complete the minimumAbsoluteDifference function below.
fun minimumAbsoluteDifference(arr: Array<Int>): Int {
    val sorted = arr.sorted()
    var min: Int? = null
    for (i in 0 until sorted.size - 1) {
        val difference = sorted[i + 1] - sorted[i]
        if (min == null) {
            min = difference
        } else {
            if (difference < min) {
                min = difference
            }
        }
    }

    return min!!
}