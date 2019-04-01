package algorithms

// Complete the minimumDistances function below.
fun minimumDistances(a: Array<Int>): Int {
    var minimumDistance = -1
    for (i in a.indices) {
        for (j in i + 1 until a.size) {
            if (a[i] == a[j]) {
                val distance = j - i
                if (minimumDistance == -1 || distance < minimumDistance) {
                    minimumDistance = distance
                }
            }
        }

        if (minimumDistance == 1) {
            break
        }
    }

    return minimumDistance
}