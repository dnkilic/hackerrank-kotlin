package algorithms

// Complete the libraryFine function below.
fun libraryFine(returnDay: Int, returnMonth: Int, returnYear: Int,
                expectedReturnDay: Int, expectedReturnMonth: Int, expectedReturnYear: Int): Int {
    return when {
        expectedReturnYear == returnYear -> {
            when {
                expectedReturnMonth == returnMonth -> {
                    when {
                        expectedReturnDay >= returnDay -> 0
                        else -> (returnDay - expectedReturnDay) * 15
                    }
                }
                expectedReturnMonth > returnMonth -> 0
                else -> (returnMonth - expectedReturnMonth) * 500
            }
        }
        expectedReturnYear >= returnYear -> 0
        else -> 10000
    }
}