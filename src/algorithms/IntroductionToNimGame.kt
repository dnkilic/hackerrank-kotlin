package algorithms

// Complete the nimGame function below.
fun nimGame(pile: Array<Int>): String {
    var counter: Int? = null
    for (i in pile) {
        counter = counter?.xor(i) ?: i
    }

    return if (counter != 0) {
        "First"
    } else {
        "Second"
    }
}