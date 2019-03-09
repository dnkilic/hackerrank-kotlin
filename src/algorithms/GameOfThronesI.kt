package algorithms

private const val NO = "NO"
private const val YES = "YES"

// Complete the gameOfThrones function below.
fun gameOfThrones(s: String): String {
    val map = s.asSequence()
            .groupBy { it }
            .filter { it.value.size % 2 != 0 }

    return if (map.count() > 1) {
        NO
    } else {
        YES
    }
}