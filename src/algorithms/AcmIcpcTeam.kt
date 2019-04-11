package algorithms

// Complete the acmTeam function below.
fun acmTeam(topics: Array<String>): Array<Int> {
    val mapOfPairs = mutableMapOf<Pair<Int, Int>, Int>()
    for (i in topics.indices) {
        for (j in i + 1 until topics.size) {
            val total = topics[i].mapIndexed { index, c ->
                if (c == '1' || topics[j][index] == '1') {
                    '1'
                } else {
                    '0'
                }
            }

            val count = total.filter { it == '1' }.count()
            mapOfPairs[Pair(i, j)] = count
        }
    }

    val max = mapOfPairs.values.max()
    val items = mapOfPairs.filter { it.value == max }.count()


    return arrayOf(max!!, items)
}