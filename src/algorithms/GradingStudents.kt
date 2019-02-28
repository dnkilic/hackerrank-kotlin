package algorithms

/*
 * Complete the gradingStudents function below.
 */
fun gradingStudents(grades: Array<Int>): Array<Int> {
    return grades.map {
        if (it in 38..100) {
            roundIfNecessary(it)
        } else {
            it
        }
    }.toTypedArray()
}

fun roundIfNecessary(grade: Int): Int {
    val module = grade % 5
    if (module >= 3) {
        return grade + 5 - module
    }

    return grade
}