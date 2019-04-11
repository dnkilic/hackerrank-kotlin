package algorithms

// Complete the cavityMap function below.
fun cavityMap(grid: Array<String>): Array<String> {
    val res = grid.map {
        it.toCharArray()
    }

    val x = res[0].size
    val y = res.size

    for (i in 0 until x) {
        for (j in 0 until y) {
            if (i != 0 && i != res[0].size - 1) {
                if (j != 0 && j != res.size - 1) {
                    if (res[i][j] > res[i - 1][j] && res[i][j] > res[i + 1][j] &&
                            res[i][j] > res[i][j - 1] && res[i][j] > res[i][j + 1]) {
                        res[i][j] = 'X'
                    }
                }
            }
        }
    }

    return res.map { String(it) }.toTypedArray()
}