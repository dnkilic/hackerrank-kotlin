package algorithms

// Complete the strangeCounter function below.
fun strangeCounter(t: Long): Long {

    var value: Long? = null
    var time: Long = 3
    while (value == null) {
        val range = (time - 2)..(time * 2 - 3)
        if (t in range) {
            value = time
        }

        time *= 2
    }

    val startingTime: Long = time - 2
    return startingTime - t
}
