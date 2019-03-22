package algorithms

// Complete the isValid function below.
fun isValid(s: String): String {
    val occurences = s.asSequence().groupBy { it }.map { it.value.size }.groupBy { it }.toList()
    return if (occurences.count() == 1) {
        "YES"
    } else if(occurences.count() == 2 && occurences.last().second.size == 1) {
        "YES"
    } else {
        "NO"
    }
}