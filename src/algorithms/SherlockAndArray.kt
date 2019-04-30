package algorithms

// Complete the balancedSums function below.
fun balancedSums(arr: Array<Int>): String {
    val nonZeroItems = arr.size - arr.filter { it == 0 }.count()
    if (nonZeroItems <= 1) {
        return "YES"
    } else {
        var i = 0
        var j = arr.size - 1
        var countA = 0
        var countB = 0
        var numbers = arr.size
        while (numbers > 0) {
            if (countA <= countB) {
                countA += arr[i]
                i++
            } else {
                countB += arr[j]
                j--
            }

            numbers--

            if (countA == countB && numbers == 1 && i == j) {
                return "YES"
            }
        }
    }

    return "NO"
}