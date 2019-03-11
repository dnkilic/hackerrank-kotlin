package algorithms

import kotlin.math.pow

// Complete the marcsCakewalk function below.
fun marcsCakewalk(calorie: Array<Int>): Long {
    return calorie.sortedDescending()
            .mapIndexed { index, i ->
                2.toDouble().pow(index).toLong() * i.toLong()
            }.sum()
}