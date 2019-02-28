package algorithms

// Complete the dayOfProgrammer function below.

private const val PROGRAMMER_DAY_DURING_NORMAL_YEAR = "13.09"
private const val PROGRAMMER_DAY_DURING_LEAP_YEAR = "12.09"

fun dayOfProgrammer(year: Int): String {

    return if (year in 1700..1917) {
        if (isLeapYearInJulianCalendar(year)) {
            "$PROGRAMMER_DAY_DURING_LEAP_YEAR.$year"
        } else {
            "$PROGRAMMER_DAY_DURING_NORMAL_YEAR.$year"
        }
    } else if (year in 1919..2700) {
        if (isLeapYearInGregorianCalendar(year)) {
            "$PROGRAMMER_DAY_DURING_LEAP_YEAR.$year"
        } else {
            "$PROGRAMMER_DAY_DURING_NORMAL_YEAR.$year"
        }
    } else {
        "26.09.1918"
    }
}

fun isLeapYearInJulianCalendar(year: Int): Boolean {
    return year % 4 == 0
}

fun isLeapYearInGregorianCalendar(year: Int): Boolean {
    return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
}