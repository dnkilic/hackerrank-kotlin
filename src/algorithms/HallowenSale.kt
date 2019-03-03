package algorithms

// Complete the howManyGames function below.
fun howManyGames(firstPrice: Int, discount: Int, basePrice: Int, money: Int): Int {
    // Return the number of games you can buy
    var gamesBought = 0
    var lastPrice = 0
    var currentMoney = money
    if (currentMoney > firstPrice) {
        while (currentMoney >= basePrice) {
            lastPrice =
                    when (gamesBought) {
                        0 -> firstPrice
                        else -> {
                            val newPrice = lastPrice - discount
                            if (newPrice > basePrice) {
                                newPrice
                            } else {
                                basePrice
                            }
                        }
                    }

            if (currentMoney >= lastPrice) {
                currentMoney -= lastPrice
                gamesBought++
            } else {
                break
            }
        }
    }

    return gamesBought
}