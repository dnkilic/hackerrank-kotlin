package algorithms

// Complete the superReducedString function below.
fun superReducedString(s: String): String {
    var superReducedString = s
    do {
        val initialLength = superReducedString.length
        for (i in superReducedString.indices) {
            if (i < superReducedString.length - 1 && superReducedString[i] == superReducedString[i + 1]) {
                superReducedString = superReducedString.removeRange(i, i + 2)
            }
        }
        val finalLength = superReducedString.length
    } while (initialLength != finalLength)


    return if (superReducedString.isNotEmpty()) {
        superReducedString
    } else {
        "Empty String"
    }
}