package algorithms

// Complete the hurdleRace function below.
fun hurdleRace(initialMaxHeight: Int, heights: Array<Int>): Int {
    val difference = heights.maxBy { it }!!.minus(initialMaxHeight)
    return when {
        difference < 0 -> 0
        else -> difference
    }
}