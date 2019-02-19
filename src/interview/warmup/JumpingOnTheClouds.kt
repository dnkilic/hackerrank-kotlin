package interview.warmup

fun jumpingOnClouds(c: Array<Int>): Int {
    var steps = 0
    var index = 0
    val lastIndex = c.size - 1
    while (index < lastIndex) {
        when {
            index + 2 <= lastIndex && c[index + 2] == 0 -> { steps++.also { index += 2 } }
            else -> { steps++.also { index ++ } }
        }
    }

    return steps
}