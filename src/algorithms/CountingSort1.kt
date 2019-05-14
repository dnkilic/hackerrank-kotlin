package algorithms

// Complete the countingSort function below.
fun countingSort(arr: Array<Int>): Array<Int> {

    val result = arrayOfNulls<Int>(100)
    for (item in arr) {
        if (result[item] != null) {
            result[item] = result[item]!! + 1
        } else {
            result[item] = 1
        }
    }


    return result.map { it ?: 0 }.toTypedArray()
}