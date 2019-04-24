package datastructures

// Complete the dynamicArray function below.
fun dynamicArray(n: Int, queries: Array<Array<Int>>): Array<Int> {
    var lastAnswer = 0
    val result = mutableListOf<Int>()
    val sequences = mutableListOf<MutableList<Int>>()
    for (i in 0 until n){
        sequences.add(mutableListOf())
    }

    for (i in queries.indices) {
        val array = queries[i]
        val queryType = array[0]
        val x = array[1]
        val y = array[2]
        if (queryType == 1) {
            val index = x.xor(lastAnswer) % n
            if (sequences.size > index) {
                sequences[index] = sequences[index].apply { add(y) }
            } else {
                sequences.add(index, mutableListOf(y))
            }
        } else {
            val index = x.xor(lastAnswer) % n
            val index2 = y % sequences[index].size
            lastAnswer = sequences[index][index2]
            result.add(lastAnswer)
        }
    }

    return result.toTypedArray()
}