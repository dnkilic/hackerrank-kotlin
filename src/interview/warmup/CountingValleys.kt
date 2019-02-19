package interview.warmup

fun countingValleys(input: String): Int {
    var valleys = 0
    var level = 0
    var insideValley = false

    for (index in input.indices) {
        if (input[index] == 'D') {
            level--
        } else {
            level++
        }

        insideValley = when {
            level == 0 && insideValley -> {
                valleys++
                false
            }
            level < 0 ->
                true
            else ->
                false
        }
    }

    return valleys
}