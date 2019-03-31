package algorithms

// Complete the jimOrders function below.
fun jimOrders(orders: Array<Array<Int>>) = orders
        .mapIndexed { index, i -> Pair(index + 1, i[0] + i[1]) }
        .sortedBy { it.second }
        .map { it.first }
        .toTypedArray()
