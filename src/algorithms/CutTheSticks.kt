package algorithms

// Complete the cutTheSticks function below.
fun cutTheSticks(arr: Array<Int>): Array<Int> {
    var list = arr.toMutableList()
    val size = list.size
    val result = mutableListOf<Int>()
    result.add(size)
    while (list.size > 0) {
        val minimum = list.min()!!
        list.removeAll(arrayListOf(minimum))
        list = list.map { it - minimum }.toMutableList()

        if (list.size > 0) {
            result.add(list.size)
        }
    }

    return result.toTypedArray()
}