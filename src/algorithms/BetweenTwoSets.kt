package algorithms

/*
 * Complete the getTotalX function below.
 */
fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    /*
     * Write your code here.
     */
    val firstItemOfB = b[0]

    val firstFactors = (1..firstItemOfB).filter { i ->
        a.asSequence().filter { i % it == 0 }.count() == a.size
    }

    val secondFactors = firstFactors.filter { j ->
        b.asSequence().filter { it % j == 0 }.count() == b.size
    }

    return secondFactors.count()
}