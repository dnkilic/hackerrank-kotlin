package algorithms

// Complete the designerPdfViewer function below.
fun designerPdfViewer(heights: Array<Int>, word: String): Int {
    val indexOfCharA = 'a'.toInt()
    val maxItem = word.map { it.toInt().minus(indexOfCharA) }.maxBy { heights[it] }!!
    return heights[maxItem] * word.length
}