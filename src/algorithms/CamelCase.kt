package algorithms

// Complete the camelcase function below.
fun camelcase(s: String) = s.filter { it.isUpperCase() }.count() + 1