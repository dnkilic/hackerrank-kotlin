package algorithms

// Complete the countApplesAndOranges function below. orange - apple +
fun countApplesAndOranges(startPointOfHouse: Int, endPointOfHouse: Int,
                          pointOfAppleTree: Int, pointOfOrangeTree: Int,
                          apples: Array<Int>, oranges: Array<Int>) {

    val appleCount = apples.map { it + pointOfAppleTree }.filter { it in startPointOfHouse..endPointOfHouse }.count()
    val orangeCount = oranges.map { it + pointOfOrangeTree }.filter { it in startPointOfHouse..endPointOfHouse }.count()

    println(appleCount)
    println(orangeCount)
}