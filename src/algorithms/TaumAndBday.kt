package algorithms

import kotlin.math.absoluteValue

// Complete the taumBday function below.
fun taumBday(b: Int, w: Int, bc: Int, wc: Int, z: Int): Long {
    val whiteCount = w.toLong()
    val blackCount = b.toLong()
    val costDifference = (bc - wc).absoluteValue
    return if (costDifference > z) {
        if(bc > wc) {
            whiteCount * wc + blackCount * wc + blackCount * z
        } else {
            blackCount * bc + whiteCount * bc + whiteCount * z
        }
    } else {
        blackCount * bc + whiteCount * wc
    }
}