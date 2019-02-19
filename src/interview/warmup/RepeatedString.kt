package interview.warmup

// Since count method has a for loop inside this solution is O(n)
fun repeatedString(text: String, newSize: Long): Long {
    val size = text.length

    // calculate occurrence of a in single text
    val occurrenceCount = text.count { it == 'a' }
    // get how many times there is exact occurrence of full text in infinite text
    val division = newSize / size

    // get the part is not included into first part
    val modulo = newSize % size
    val subText = text.substring(0, modulo.toInt())
    val subTextOccurrenceCount = subText.count { it == 'a' }

    return (division * occurrenceCount) + subTextOccurrenceCount
}