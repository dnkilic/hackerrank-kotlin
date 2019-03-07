package algorithms

private const val NOT_PANGRAM = "not pangram"
private const val PANGRAM = "pangram"
private const val ENGLISH_ALPHABET = 26

// Complete the pangrams function below.
fun pangrams(s: String): String {
    val map = s.asSequence()
            .filter { it != ' ' }
            .groupBy { it.toLowerCase() }
    return if (map.count() == ENGLISH_ALPHABET) {
        PANGRAM
    } else {
        NOT_PANGRAM
    }
}