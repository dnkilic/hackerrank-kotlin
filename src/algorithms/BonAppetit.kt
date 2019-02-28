package algorithms

// Complete the bonAppetit function below.
fun bonAppetit(bill: Array<Int>, indexOfAllergicMeal: Int, paidByAnna: Int) {
    val difference = paidByAnna - bill
            .asSequence()
            .filterIndexed { index, _ -> index != indexOfAllergicMeal }
            .sum().div(2)
    if (difference == 0) {
        println("Bon Appetit")
    } else {
        println(difference)
    }
}
