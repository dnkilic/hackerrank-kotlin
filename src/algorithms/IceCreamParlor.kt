package algorithms

// Complete the icecreamParlor function below.
fun icecreamParlor(m: Int, arr: Array<Int>): Array<Int> {

    for (i in arr.indices) {
        for (j in (i + 1)..(arr.size - 1)) {
            if (arr[i] + arr[j] == m) {
                return arrayOf(i + 1, j + 1)
            }
        }
    }

    return emptyArray()
}