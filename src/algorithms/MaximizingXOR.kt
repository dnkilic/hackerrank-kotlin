package algorithms

// Complete the maximizingXor function below.
fun maximizingXor(l: Int, r: Int): Int {

    var max = 0
    for (i in l..r) {
        for (j in i..r) {
            val xor = i.xor(j)
            if (xor > max) {
                max = xor
            }
        }
    }

    return max
}