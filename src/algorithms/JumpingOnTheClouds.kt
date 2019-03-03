package algorithms

fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
    val numberOfClouds = c.size
    var energy = 100
    var index = 0
    do {
        if (index + k > numberOfClouds) {
            val tempIndex = (index + k) % numberOfClouds
            energy -= energyConsumption(c, tempIndex)
            break
        } else {
            index = (index + k) % numberOfClouds
            energy -= energyConsumption(c, index)
        }
    } while (index != 0)

    return energy
}

fun energyConsumption(c: Array<Int>, index: Int): Int {
    var requiredEnergy = 1
    if (c[index] == 1) {
        requiredEnergy += 2
    }

    return requiredEnergy
}
