package interview.warmup

fun sockMerchant(ar: Array<Int>): Int {
    val map = ar.groupBy { it } // converting array to map
    var pairCount = 0
    for ((_, value) in map) {
        pairCount += value.size / 2
    }
    return pairCount
}