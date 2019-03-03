package algorithms

// Complete the kaprekarNumbers function below.
fun kaprekarNumbers(p: Int, q: Int) {
    val numbers = p..q
    val kaprekarNumbers = numbers.asSequence().map { it.toLong() }.filter { n ->
        val power = n * n
        val digits = n.toString().length
        val stringRepresentation = power.toString()
        val powDigits = power.toString().length

        if (powDigits == digits * 2
                || powDigits == (digits * 2) - 1) {
            val range = (powDigits - digits)..(powDigits - 1)
            val right = stringRepresentation.substring(range).toLong()
            val leftAsString = stringRepresentation.removeRange(range)
            val left = if (leftAsString.isNotEmpty()) {
                leftAsString.toLong()
            } else {
                0
            }

            n == left + right
        } else {
            false
        }
    }.toList()

    if (kaprekarNumbers.isNotEmpty()) {
        var result = ""
        kaprekarNumbers.forEachIndexed { index, i ->
            result += if (index == 0) {
                "$i"
            } else {
                " $i"
            }
        }

        print(result)
    } else {
        println("INVALID RANGE")
    }
}