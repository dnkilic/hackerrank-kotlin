package algorithms

// Complete the maximumToys function below.
fun maximumToys(prices: Array<Int>, k: Int): Int {
    var spent = 0
    return prices.asSequence()
            .sorted()
            .takeWhile {
                spent += it
                spent <= k
            }.count()
}