package algorithms

// Complete the insertionSort2 function below.
fun insertionSort2(n: Int, arr: Array<Int>) {
    for (i in 1 until n) {
        var j = i
        while (j - 1 >= 0 && arr[j] < arr[j - 1]) {
            val temp = arr[j]
            arr[j] = arr[j - 1]
            arr[j - 1] = temp
            j--
        }

        println(arr.joinToString(separator = " "))
    }
}