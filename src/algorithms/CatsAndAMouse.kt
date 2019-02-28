package algorithms

// Complete the catAndMouse function below.
fun catAndMouse(catA: Int, catB: Int, mouse: Int): String {

    val disatanceOfCatA = if (mouse > catA) {
        (catA..mouse).count()
    } else {
        (mouse..catA).count()
    }

    val disatanceOfCatB = if (mouse > catB) {
        (catB..mouse).count()
    } else {
        (mouse..catB).count()
    }

    return when {
        disatanceOfCatA > disatanceOfCatB -> "Cat B"
        disatanceOfCatA < disatanceOfCatB -> "Cat A"
        else -> "Mouse C"
    }
}