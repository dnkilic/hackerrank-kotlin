package algorithms

// Complete the appendAndDelete function below.
fun appendAndDelete(s: String, t: String, k: Int): String {
    val lengthOfFirst = s.length
    val lengthOfLast = t.length

    return if (s == t && k >= lengthOfFirst * 2) {
        "Yes"
    } else if (k > lengthOfFirst + lengthOfLast) {
        "Yes"
    } else {
        val countOfSameElements = getCountOfEqualFirstChars(s, t)
        val needToDelete = s.length - countOfSameElements
        val needToAppend = t.length - countOfSameElements
        val totalOperation = needToAppend + needToDelete

        return when {
            totalOperation == k -> "Yes"
            totalOperation < k && (k - totalOperation) % 2 == 0 -> "Yes"
            else -> "No"
        }
    }
}

fun getCountOfEqualFirstChars(s: String, t: String): Int {
    var countOfSameElements = 0
    for (i in s.indices) {
        if (t.length > i && s[i] == t[i]) {
            countOfSameElements++
        } else {
            break
        }
    }

    return countOfSameElements
}
