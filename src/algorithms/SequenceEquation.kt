package algorithms


// Complete the permutationEquation function below.
fun permutationEquation(p: Array<Int>): Array<Int> {

    val result = arrayListOf<Int>()
    for (x in 1..p.size) {
        val p1 = p.indexOf(x) + 1
        val p2 = p.indexOf(p1) + 1
        result.add(p2)
    }

    return result.toTypedArray()
}
