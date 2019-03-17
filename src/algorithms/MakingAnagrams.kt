package algorithms

import kotlin.math.absoluteValue

// Complete the makingAnagrams function below.
fun makingAnagrams(s1: String, s2: String): Int {

    val firstMap = s1.groupBy { it }
    val secondMap = s2.groupBy { it }

    val distinctCountOfFirstMap = firstMap.asSequence()
            .filter { !secondMap.containsKey(it.key) }
            .map { it.value.size }
            .sum()
    val distinctCountOfSecondMap = secondMap.asSequence()
            .filter { !firstMap.containsKey(it.key) }
            .map { it.value.size }
            .sum()
    val sameElementSizeDistinction = firstMap.filter { secondMap.containsKey(it.key) }
            .map { (it.value.size - secondMap.getValue(it.key).size).absoluteValue }
            .sum()

    return distinctCountOfFirstMap + distinctCountOfSecondMap + sameElementSizeDistinction
}