package algorithms

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {

    var max = scores[0]
    var min = scores[0]
    var maxCounts = 0
    var minCounts = 0
    scores.forEach {
        if (it > max) {
            maxCounts++
            max = it
        }

        if (it < min) {
            minCounts++
            min = it
        }
    }

    return arrayOf(max, min)
}
