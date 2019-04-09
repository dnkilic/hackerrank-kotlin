package algorithms

// Complete the superDigit function below.
fun superDigit(n: String, k: Int): Int {
    val firstResult = find(n)
    return find((firstResult * k).toString())
}

fun find(n: String): Int {
    return if (n.length == 1) {
        n.toInt()
    } else {
        find(n.map { Integer.valueOf(it.toString()) }.sum().toString())
    }
}