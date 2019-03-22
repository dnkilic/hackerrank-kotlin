package algorithms

// Complete the stringConstruction function below.
fun stringConstruction(s: String) = s.asSequence().groupBy { it }.map { it.key }.count()