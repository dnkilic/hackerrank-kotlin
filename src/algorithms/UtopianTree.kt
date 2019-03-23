package algorithms

// Complete the utopianTree function below.
fun utopianTree(n: Int): Int {
    var height = 1

    for (i in 1..n) {
        if (i.rem(2) == 0) {
            height += 1
        } else {
            height *= 2
        }
    }

    return height
}