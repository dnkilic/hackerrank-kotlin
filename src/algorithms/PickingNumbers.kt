package algorithms

fun pickingNumbers(a: Array<Int>): Int {
    val map = a.asSequence().groupBy { it }
    var biggest = 0
    for ((key, value) in map) {
        var before = 0
        if (map.containsKey(key - 1)) {
            before = map[key - 1]!!.size + value.size
        }

        if (before > biggest) {
            biggest = before
        }

        var after = 0
        if (map.containsKey(key + 1)) {
            after = map[key + 1]!!.size + value.size
        }

        if (after > biggest) {
            biggest = after
        }

        if (value.size > biggest) {
            biggest = value.size
        }
    }

    return biggest
}
