package algorithms

// Complete the findDigits function below.
fun findDigits(n: Int) =
        n.toString().asSequence()
                .map { Character.getNumericValue(it) }
                .filter { it != 0 && n % it == 0  }
                .count()
