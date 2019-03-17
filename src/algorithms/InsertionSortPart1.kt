package algorithms

// Complete the insertionSort1 function below.
fun insertionSort1(n: Int, arr: Array<Int>) {
    val lastElement = arr[n - 1]
    for (i in n - 1 downTo 0) {
        if (i - 1 >= 0 && arr[i - 1] > lastElement) {
            arr[i] = arr[i - 1]
            printArray(arr)
        } else {
            arr[i] = lastElement
            printArray(arr)
            break
        }
    }
}

fun printArray(arr: Array<Int>) {
    var result = ""
    for (i in arr.indices) {
        result = "$result ${arr[i]}"
    }

    println(result.trim())
}