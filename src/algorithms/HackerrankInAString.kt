package algorithms

private const val NO = "NO"
private const val YES = "YES"

// Complete the hackerrankInString function below.
fun hackerrankInString(s: String): String {

    val hackerrank = "hackerrank"
    var currentIndex = 0
    for (i in s) {
        if (i == hackerrank[currentIndex]) {
            currentIndex++
        }

        if(currentIndex == hackerrank.length - 1) {
            break
        }
    }

    return if (currentIndex == hackerrank.length - 1) {
        YES
    } else {
        NO
    }
}