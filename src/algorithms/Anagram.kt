package algorithms

// Complete the anagram function below.
fun anagram(s: String): Int {
    if (s.length % 2 == 1) {
        return -1
    }

    val first = s.subSequence(0, s.length / 2).groupBy { it }
    val second = s.subSequence(s.length / 2, s.length).groupBy { it }
    var count = 0



    for (item in first) {
        if (second.containsKey(item.key)) {
            val firstSize = item.value.size
            val secondSize = second.getValue(item.key).size
            if (firstSize > secondSize) {
                count += firstSize - secondSize
            }
        } else {
            count += item.value.size //need change
        }
    }

    return count
}