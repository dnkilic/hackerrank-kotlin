package algorithms

import java.math.BigInteger

// Complete the extraLongFactorials function below.
fun extraLongFactorials(n: Int) {
    print(factorial(n.toBigInteger()))
}

fun factorial(n: BigInteger): BigInteger {
    return if (n == 1.toBigInteger()) {
        1.toBigInteger()
    } else {
        n * factorial(n - 1.toBigInteger())
    }
}