package algorithms

// Complete the beautifulBinaryString function below.
fun beautifulBinaryString(b: String): Int {
    var count = 0
    var beautifulString = b

    while (beautifulString.contains("010")) {
        beautifulString = beautifulString.replaceFirst("010", "011")
        count++
    }

    return count
}