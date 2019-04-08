package algorithms

// Complete the beautifulTriplets function below.
fun beautifulTriplets(d: Int, arr: Array<Int>): Int {
    val beautifulTriplets = mutableSetOf<Triple<Int, Int, Int>>()
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            val resultFirst = arr[j] - arr[i]
            if (resultFirst != d) {
                continue
            }
            for (k in j + 1 until arr.size) {
                val resultSecond = arr[k] - arr[j]
                if (resultSecond != d) {
                    continue
                }
                if (resultFirst == d && resultSecond == d) {
                    beautifulTriplets.add(Triple(i, j, k))
                }
            }
        }
    }

    return beautifulTriplets.count()
}