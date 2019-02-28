package algorithms

// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
    return arr.asSequence()
            .groupBy { it }
            .toSortedMap()
            .maxBy { it.value.size }!!.key
}