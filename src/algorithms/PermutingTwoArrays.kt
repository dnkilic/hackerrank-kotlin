package algorithms

// Complete the twoArrays function below.
fun twoArrays(k: Int, A: Array<Int>, B: Array<Int>): String {
    val sortedA = A.sorted()
    val descendingSortedB = B.sorted().reversed()

    for (i in 0 until sortedA.size) {
        if (sortedA[i] + descendingSortedB[i] < k) {
            return "NO"
        }
    }

    return "YES"
}