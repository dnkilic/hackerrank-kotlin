package algorithms

// Complete the encryption function below.
fun encryption(s: String): String {
    val size = s.length
    val sqrt = Math.sqrt(size.toDouble())
    val upper = Math.ceil(sqrt).toInt()
    val lower = Math.floor(sqrt).toInt()
    var result = ""
    if (upper * lower >= size) {
        val items = s.chunked(upper)
        for (i in 0..items.size) {
            for (j in 0..(lower - 1)) {
                if (items[j].length > i) {
                   result += items[j][i]
                }
            }

            result += " "
        }
    } else {
        val items = s.chunked(upper)
        for (i in 0..items.size) {
            for (j in 0..(upper - 1)) {
                if (items[j].length  > i) {
                    result += items[j][i]
                }
            }

            result += " "
        }
    }

    return result
}