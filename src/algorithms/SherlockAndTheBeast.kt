package algorithms

// Complete the decentNumber function below.
fun decentNumber(n: Int) {

    val mod3 = n % 3
    var result = "-1"
    if (mod3 == 0) {
        result = "5".repeat(n)
    }  else {
        val maximumNumberOf5 = n / 3
        for (i in maximumNumberOf5 downTo 0) {
            if ((n - i * 3) % 5 == 0) {
                result = "555".repeat(i) + "33333".repeat((n - i * 3) / 5)
                break
            }
        }
    }

    println(result)
}