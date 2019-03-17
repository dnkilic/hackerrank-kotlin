package algorithms

import kotlin.math.absoluteValue

// Complete the funnyString function below.
fun funnyString(s: String): String {
    val list = computeDifferences(s)
    val reversedString = s.reversed()
    val reversedList = computeDifferences(reversedString)

    return if (list == reversedList) {
        "Funny"
    } else {
        "Not Funny"
    }
}

fun computeDifferences(s: String): List<Int> {
    val list = mutableListOf<Int>()
    for (i in s.indices){
        if (i < s.length - 1) {
            val difference = s[i] - s[i + 1]
            list.add(difference.absoluteValue)
        }
    }

    return list
}