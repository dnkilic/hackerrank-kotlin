package algorithms

// Complete the gridChallenge function below.
fun gridChallenge(grid: Array<String>): String {
    val sorted = grid.map { it.toCharArray().sorted() }
    for (i in sorted[0].indices) {
        var current: Char? = null
        for (j in sorted.indices) {
            current = if (current == null) {
                sorted[j][i]
            } else {
                if (sorted[j][i] < current) {
                    return "NO"
                } else {
                    sorted[j][i]
                }
            }
        }
    }

    return "YES"
}