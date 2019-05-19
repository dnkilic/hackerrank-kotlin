package algorithms

// Complete the toys function below.
fun toys(w: Array<Int>): Int {
    val sorted = w.toSortedSet().toList()
    var counter = 1
    var range: IntRange? = null
    for (i in sorted.indices) {
        if (range == null) {
            range = sorted[i]..(sorted[i] + 4)
        }

        if (sorted[i] in range) {
            continue
        } else {
            counter++
            range = sorted[i]..(sorted[i] + 4)
        }
    }

    return counter
}