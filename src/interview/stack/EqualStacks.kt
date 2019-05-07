package interview.stack

/*
 * Complete the equalStacks function below.
 */
fun equalStacks(h1: Array<Int>, h2: Array<Int>, h3: Array<Int>): Int {

    var height1 = h1.sum()
    var height2 = h2.sum()
    var height3 = h3.sum()

    var count1 = 0
    var count2 = 0
    var count3 = 0

    while ((height1 != height2) || (height2 != height3) || (height1 != height3)) {
        val max = arrayOf(height1, height2, height3).max()
        when (max) {
            height1 -> {
                height1 -= h1[count1]
                count1++
            }
            height2 -> {
                height2 -= h2[count2]
                count2++
            }
            height3 -> {
                height3 -= h3[count3]
                count3++
            }
        }
    }

    return height1
}