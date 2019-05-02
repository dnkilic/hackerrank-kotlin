package algorithms

// Complete the closestNumbers function below.
fun closestNumbers(arr: Array<Int>): Array<Int> {
    val items = arr.sortedArray()
    var minimumDiff: Int? = null
    val list = mutableListOf<Pair<Int, Int>>()
    for (i in 0 until items.size - 1) {
        val diff = items[i + 1] - items[i]
        if (minimumDiff == null || diff < minimumDiff) {
            list.removeAll(list)
            minimumDiff = diff
            list.add(items[i] to items[i + 1])
        } else if (diff == minimumDiff){
            list.add(items[i] to items[i + 1])
        }
    }

    return list.flatMap { it.toList() }.toTypedArray()
}