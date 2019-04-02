package algorithms

// Complete the flippingBits function below.
@ExperimentalUnsignedTypes
fun flippingBits(n: Long): Long {
    var stringRepresentation = n.toUInt().toString(radix = 2)
    val c = "0".repeat(32 - stringRepresentation.length)
    stringRepresentation = "$c$stringRepresentation"

    var sum = 0L
    stringRepresentation.mapIndexed { index, char ->
        if (char == '0') {
            sum+= Math.pow(2.0, (31 - index).toDouble()).toLong()
        }
    }

    return sum
}