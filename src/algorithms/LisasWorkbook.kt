package algorithms

// Complete the workbook function below.
fun workbook(chapters: Int, pagePerProblems: Int, problems: Array<Int>): Int {
    val pages = mutableMapOf<Int, List<Int>>()
    var page = 1
    for (i in 1..chapters) {
        (1..problems[i - 1])
                .groupBy { (it - 1) / pagePerProblems }
                .map { it.value }
                .forEach {
                    pages[page] = it
                    page++
                }
    }

    return pages.filter { it.value.contains(it.key) }.count()
}