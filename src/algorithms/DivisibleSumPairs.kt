package algorithms

// Complete the birthday function below.
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    val setOfPairs = mutableListOf<Pair<Int, Int>>()
    for (i in ar.indices) {
        for (j in ar.indices) {
            if (i < j) {
                if ((ar[i] + ar[j]) % k == 0) {
                    setOfPairs.add(Pair(ar[i], ar[j]))
                }
            } else {
                continue
            }
        }
    }

    return setOfPairs.count()
}
