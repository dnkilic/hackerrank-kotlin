package algorithms

private const val NO = "NO"
private const val YES = "YES"

// Complete the twoStrings function below.
fun twoStrings(s1: String, s2: String) =
        if (s1.toSet().intersect(s2.toSet()).count() > 0) {
            YES
        } else {
            NO
        }