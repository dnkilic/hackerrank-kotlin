package algorithms

val pronounciationMap = mapOf(
        1 to "one",
        2 to "two",
        3 to "three",
        4 to "four",
        5 to "five",
        6 to "six",
        7 to "seven",
        8 to "eight",
        9 to "nine",
        11 to "eleven",
        12 to "twelve",
        13 to "thirteen",
        14 to "fourteen",
        16 to "sixteen",
        17 to "seventeen",
        18 to "eighteen",
        19 to "nineteen"
)

const val ten = "ten"
const val twenty = "twenty"

const val oclock = "o' clock"
const val minute = "minute"
const val minutes = "minutes"
const val to = "to"
const val past = "past"
const val quarter = "quarter"
const val half = "half"

// Complete the timeInWords function below.
fun timeInWords(h: Int, m: Int): String {
    return when {
        m == 0 -> "${mapHour(h)} $oclock"
        m == 15 -> "$quarter $past ${mapHour(h)}"
        m == 45 -> "$quarter $to ${mapHour(h + 1)}"
        m == 30 -> "$half $past ${mapHour(h)}"
        m > 30 -> "${mapMinute(m)} $to ${mapHour(h + 1)}"
        else -> "${mapMinute(m)} $past ${mapHour(h)}"
    }
}

private fun mapHour(h: Int): String {
    return pronounciationMap.getValue(h)
}

private fun mapMinute(m: Int): String {
    var res = ""
    if (m <= 1) {
        res = "${pronounciationMap.getValue(m)} $minute"
    } else {
        val division = m / 10
        when(division) {
            0 -> res = pronounciationMap.getValue(m)
            1 -> res = if (m == 10) { ten } else { pronounciationMap.getValue(m) }
            2 -> res = if (m == 20) { twenty } else { "$twenty ${pronounciationMap.getValue(m % 20)}" }
            3 -> res = "$twenty ${pronounciationMap.getValue((60 - m) % 10)}"
            4 -> res = if (m == 40) { twenty } else { pronounciationMap.getValue(60 - m) }
            5 -> res = if (m == 50) { ten } else { pronounciationMap.getValue(60 - m) }
        }

        res = "$res $minutes"
    }

    return res
}