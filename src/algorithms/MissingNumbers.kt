package algorithms


// Complete the missingNumbers function below.
fun missingNumbers(arr: Array<Int>, brr: Array<Int>): Array<Int> {
    val missingMap = arr.asSequence().groupBy { it }
    val originalMap = brr.asSequence().groupBy { it }
    return originalMap.asSequence()
            .filter { !missingMap.containsKey(it.key) || missingMap.getValue(it.key).size != it.value.size }
            .map { it.key }
            .toList()
            .sorted()
            .toTypedArray()
}