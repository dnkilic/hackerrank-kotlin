package algorithms

import kotlin.math.absoluteValue

// Complete the theLoveLetterMystery function below.
fun theLoveLetterMystery(s: String): Int {
    var rightIndex = s.length - 1
    var count = 0
    for (i in s.indices) {
        if (i < rightIndex && s[i] != s[rightIndex]) {
            count += (s[i] - s[rightIndex]).absoluteValue
        }

        rightIndex--
    }

    return count
}