package algorithms

// Complete the counterGame function below.
fun counterGame(n: Long): String {
    var value = 0.0
    var power = 0.0
    val listOfPowers = mutableListOf<Long>()
    while (value <= n) {
        value = Math.pow(2.0, power)
        listOfPowers.add(value.toLong())
        power++
    }

    var result = n
    var turn = 0
    var winner = "Richard"
    while (result != 1L) {
        if (listOfPowers.contains(result)) {
            result /= 2
        } else {
            val biggestPower = listOfPowers.asSequence().filter { it < result }.max()!!
            result -= biggestPower
        }

        turn++

        if (result == 1L) {
            winner = if (turn % 2 == 0) {
                "Richard"
            } else {
                "Louise"
            }
            break
        }
    }

    return winner
}