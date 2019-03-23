package algorithms

// Complete the flatlandSpaceStations function below.
fun flatlandSpaceStations(n: Int, c: Array<Int>): Int {
    val rangeArray = mutableListOf<Int>()
    var range = 0
    for (i in 0..n) {
        if (c.contains(i)) {
            rangeArray.add(range)
            range = 0
        } else {
            range++
        }

        if (i == n) {
            rangeArray.add(range)
        }
    }

    val result = rangeArray.max()!! - 1
    return if (result > 0) {
        result
    } else {
        0
    }
}