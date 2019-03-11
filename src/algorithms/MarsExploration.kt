package algorithms

// Complete the marsExploration function below.
fun marsExploration(s: String) =
        s.chunked(3)
                .asSequence()
                .map {
                    var count = 0
                    if (it[0] != 'S') {
                        count++
                    }

                    if (it[1] != 'O') {
                        count++
                    }

                    if (it[2] != 'S') {
                        count++
                    }

                    return@map count
                }.sum()
