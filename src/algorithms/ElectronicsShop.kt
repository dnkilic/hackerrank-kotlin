package algorithms

/*
 * Complete the getMoneySpent function below.
 */
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, money: Int): Int {
    /*
     * Write your code here.
     */

    var suitable = 0
    keyboards.forEach { keyboard ->
        drives.forEach { drive ->
            val total = keyboard + drive
            if (total in (suitable + 1)..(money)) {
                suitable = total
            }
        }
    }

    return if (suitable == 0) {
        -1
    }else {
        suitable
    }
}