package algorithms

// Complete the fairRations function below.
fun fairRations(B: Array<Int>): String {
    val map = B.map { it % 2 }
    val isOdd = map.filter { it == 1 }.count() % 2 == 1
    if (isOdd) {
        return "NO"
    } else {
        var startIndex = 0
        var endIndex = 0
        var lock = true
        val ranges = mutableListOf<Pair<Int, Int>>()
        for (i in map.indices) {
            if (map[i] == 1) {
                if (lock) {
                    startIndex = i
                    lock = false
                } else {
                    endIndex = i
                    ranges.add(Pair(startIndex, endIndex))
                    lock = true
                }
            }
        }

        var total = 0
        for (range in ranges) {
            val difference = range.second - range.first
            total += difference
        }

        return (total * 2).toString()
    }
}


// 2 3 4 5 6 -> 1 3 = 2
// 4 5 6 7 -> 1 3 = 2
// 2 1 3 4 6 8 10 -> 1 2 = 1
// 8 6 2 3 4 5 9 -> 3 6 = 3