package algorithms


// Complete the runningTime function below.
fun runningTime(arr: Array<Int>): Int {
    var runningTime = 0
    for (i in 1 until arr.size) {
        var j = i
        while (j > 0) {
            if (arr[j] < arr[j - 1]) {
                val temp = arr[j - 1]
                arr[j - 1] = arr[j]
                arr[j] = temp
                runningTime++
            }

            j--
        }
    }


    return runningTime
}