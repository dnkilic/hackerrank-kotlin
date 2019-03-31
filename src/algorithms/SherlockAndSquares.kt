package algorithms

// Complete the squares function below.
fun squares(a: Int, b: Int): Int {
    val lowerIndex = Math.ceil(Math.sqrt(a.toDouble())).toInt()
    val higherIndex = Math.sqrt(b.toDouble()).toInt()

    return if (lowerIndex > higherIndex) {
        0
    } else {
        (lowerIndex..higherIndex).count()
    }
}