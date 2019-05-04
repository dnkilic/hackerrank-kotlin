package algorithms

// Complete the maximumPerimeterTriangle function below.
fun maximumPerimeterTriangle(sticks: Array<Int>): Array<Int> {
    var max: Pair<Int, Triple<Int, Int, Int>>? = null
    for (i in sticks.indices) {
        for (j in sticks.indices) {
            if (j == i) continue
            for (k in sticks.indices) {
                if (k == i || k == j) continue
                if (i != j && j != k) {
                    val a = sticks[i]
                    val b = sticks[j]
                    val c = sticks[k]
                    if (a + b > c && a + c > b && b + c > a) {
                        if (b > c || a > b || a > c) continue
                        val total = a + b + c
                        if (max == null || total > max.first) {
                            max = Pair(total, Triple(a,b,c))
                        }
                    }
                }
            }
        }
    }

    return if (max == null) {
        arrayOf(-1)
    } else {
        val triple = max.second
        arrayOf(triple.first, triple.second, triple.third)
    }
}