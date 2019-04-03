package algorithms

private const val YES = "YES"
private const val NO = "NO"

// Complete the happyLadybugs function below.
fun happyLadybugs(b: String): String {
    val boardMap = b.groupBy { it }.filterNot { it.key == '_' }
    if (boardMap.isEmpty()) {
        return YES
    }

    when {
        b.contains('_') -> {
            return if (boardMap.any { it.value.size == 1 }) {
                NO
            } else {
                YES
            }
        }
        else -> {
            return if (checkIfAllBugsHappy(b)) {
                YES
            } else {
                NO
            }
        }
    }
}

private fun checkIfAllBugsHappy(b: String): Boolean {
    var sequenceCount = 0
    for (i in b.indices) {
        if (i < b.length - 1 && b[i] == b[i+1]) {
            sequenceCount++
        } else {
            if (sequenceCount == 0) {
                return false
            }
            sequenceCount = 0
        }
    }

    return true
}