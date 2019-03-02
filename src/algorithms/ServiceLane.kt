package algorithms

// Complete the serviceLane function below.
fun serviceLane(n: Array<Int>, cases: Array<Array<Int>>) =
        cases.asSequence()
            .map { n.copyOfRange(it[0], it[1] + 1).min()!! }
            .toList()
            .toTypedArray()