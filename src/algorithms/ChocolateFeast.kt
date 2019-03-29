package algorithms

// Complete the chocolateFeast function below.
fun chocolateFeast(money: Int, costOfOneBar: Int, costOfOneBarAsWrapper: Int): Int {
    var barCount = money / costOfOneBar
    var wrapperCount = barCount
    while (wrapperCount >= costOfOneBarAsWrapper) {
        val newBars = wrapperCount / costOfOneBarAsWrapper
        barCount += newBars
        wrapperCount %= costOfOneBarAsWrapper
        wrapperCount += newBars
    }

    return barCount
}