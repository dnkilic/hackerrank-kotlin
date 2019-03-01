package algorithms

import kotlin.math.absoluteValue

// Complete the beautifulDays function below.
fun beautifulDays(i: Int, j: Int, k: Int): Int {
    val range = i..j
    return range.asSequence()
            .map { (it - it.toString().reversed().toInt()).absoluteValue }
            .filter { it % k == 0 }
            .count()
}