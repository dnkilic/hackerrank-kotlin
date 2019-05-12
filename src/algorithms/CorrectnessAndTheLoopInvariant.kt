package algorithms

fun insertionSort(A: IntArray) {
    for (i in 1 until A.size) {
        val value = A[i]
        var j = i - 1
        while (j >= 0 && A[j] > value) {
            val temp = A[j + 1]
            A[j + 1] = A[j]
            A[j] = temp
            j -= 1
        }
        A[j + 1] = value
    }

    printArray(A)
}


fun printArray(ar: IntArray) {
    for (n in ar) {
        print("$n ")
    }
}