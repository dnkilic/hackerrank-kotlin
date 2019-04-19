package algorithms

// Complete the stones function below.
fun stones(n: Int, a: Int, b: Int): Array<Int> {
    val numbers = mutableSetOf<Int>()
    when (a) {
        b -> numbers.add((n - 1).times(a))
        else -> {
            for (i in 0 until n) {
                val number = i.times(a) + b.times(n - 1 - i)
                numbers.add(number)
            }
        }
    }

    return numbers.sorted().toTypedArray()
}