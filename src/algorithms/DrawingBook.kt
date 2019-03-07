package algorithms

fun pageCount(n: Int, p: Int): Int {

    val leftRange = 0..p
    val rightRange = n downTo p

    return if (leftRange.count() <= rightRange.count()) {
        p / 2
    } else {
        n / 2 - p / 2
    }
}