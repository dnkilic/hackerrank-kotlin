package algorithms

// Complete the gemstones function below.
fun gemstones(arr: Array<String>): Int {

    val sets = arr.map { it.toSet() }
    var intersection = mutableSetOf<Char>()
    for (i in sets.indices) {
        if (i < sets.size - 1) {
            intersection = if (i == 0) {
                sets[i].intersect(sets[i + 1]).toMutableSet()
            } else {
                intersection.intersect(sets[i + 1]).toMutableSet()
            }

            if (intersection.count() == 0) {
                break
            }
        }
    }

    return intersection.count()
}
