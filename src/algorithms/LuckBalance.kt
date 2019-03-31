package algorithms

// Complete the luckBalance function below.
fun luckBalance(k: Int, contests: Array<Array<Int>>): Int {
    val important = contests.filter { it[1] == 1 }
    var importantLose = mutableListOf<Int>()
    var importantWin = mutableListOf<Int>()
    if (important.isNotEmpty()) {
        var losableImportantCount = k
        if (k > important.size) {
            losableImportantCount = important.size
        }
        importantLose = important.sortedByDescending { it[0] }.subList(0, losableImportantCount).map { it[0] }.toMutableList()
        importantWin = important.sortedByDescending { it[0] }.subList(losableImportantCount, important.size).map { it[0] }.toMutableList()
    }

    val notImportant = contests.filter { it[1] == 0 }
    return importantLose.sumBy { it } + notImportant.sumBy { it[0] } - importantWin.sumBy { it }
}