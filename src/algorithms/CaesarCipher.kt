package algorithms

// Complete the caesarCipher function below.
fun caesarCipher(s: String, k: Int): String {
    val lowerAIndex = 'a'.toInt()
    val upperAIndex = 'A'.toInt()
    val lowerZIndex = 'z'.toInt()
    val upperZIndex = 'Z'.toInt()
    val shift = k % 26

   return String(s.map {
        if (it.isLetter() && it.isLowerCase()) {
            val value = (it.toInt() + shift)
            if (value > lowerZIndex) {
                (lowerAIndex - 1 + value % lowerZIndex).toChar()
            } else {
                (it.toInt() + shift).toChar()
            }
        } else if (it.isLetter() && it.isUpperCase()) {
            val value = (it.toInt() + shift)
            if (value > upperZIndex) {
                (upperAIndex - 1 + value % upperZIndex).toChar()
            } else {
                (it.toInt() + shift).toChar()
            }
        } else {
            it
        }
    }.toCharArray())
}