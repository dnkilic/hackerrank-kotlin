package algorithms

// Complete the alternatingCharacters function below.
fun alternatingCharacters(s: String): Int {
    var previousCharacter: Char? = null
    var removalCounter = 0
    for (i in s.indices) {
        if (previousCharacter != null && s[i] == previousCharacter) {
            removalCounter++
        }

        previousCharacter = s[i]
    }

    return removalCounter
}
