package algorithms

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var counter = 0
    for (i in s.indices) {
        if (i + m - 1 < s.size) {
            var sum = 0
            for (j in i..(i + m - 1)) {
                sum += s[j]
            }
            if (sum == d) {
                counter++
            }
        } else {
            break
        }
    }

    return counter
}