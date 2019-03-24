package algorithms

// Complete the matchingStrings function below.
fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    val stringMap = strings.groupBy { it }
    return queries.map {
        if (stringMap.containsKey(it)) {
            stringMap.getValue(it).size
        } else {
            0
        }
    }.toTypedArray()
}