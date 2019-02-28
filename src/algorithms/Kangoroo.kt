package algorithms

private const val YES = "YES"
private const val NO = "NO"

// Complete the kangaroo function below.
fun kangaroo(firstKangarooStartPoint: Int, firstKangarooJumpSize: Int,
             secondKangarooStartPoint: Int, secondKangarooJumpSize: Int): String {
    return if (firstKangarooStartPoint > secondKangarooStartPoint) {
         if (secondKangarooJumpSize > firstKangarooJumpSize) {
            val difference = firstKangarooStartPoint - secondKangarooStartPoint
            val speedDifference = secondKangarooJumpSize - firstKangarooJumpSize
            if (isItPossibleToMeetAtSomewhere(difference, speedDifference)) {
                YES
            } else {
                NO
            }
        } else {
            NO
        }
    } else if (secondKangarooStartPoint > firstKangarooStartPoint) {
        if (firstKangarooJumpSize > secondKangarooJumpSize) {
            val difference = secondKangarooStartPoint - firstKangarooStartPoint
            val speedDifference = firstKangarooJumpSize - secondKangarooJumpSize
            if (isItPossibleToMeetAtSomewhere(difference, speedDifference)) {
                YES
            } else {
                NO
            }
        } else {
            return NO
        }
    } else {
        return YES
    }
}

fun isItPossibleToMeetAtSomewhere(difference: Int, speedDifference: Int): Boolean  {
    return difference % speedDifference == 0
}