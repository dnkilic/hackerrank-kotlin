package algorithms

// Complete the pairs function below.
fun pairs(k: Int, arr: Array<Int>): Int {
    var pairsCounter = 0
    val set = arr.toSet()
    for (item in set) {
        val difference = item - k
        val searchResult = set.contains(difference)
        if (searchResult) {
            pairsCounter++
        }
    }

    return pairsCounter
}