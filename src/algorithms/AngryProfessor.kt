package algorithms

private const val NO = "NO"
private const val YES = "YES"

fun angryProfessor(threshold: Int, arrivalStatuses: Array<Int>): String {
    val result = arrivalStatuses.filter { it <= 0 }.count()
    return if (result >= threshold) {
        NO
    } else {
        YES
    }
}
