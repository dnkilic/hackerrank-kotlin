package algorithms

// Complete the viralAdvertising function below.
fun viralAdvertising(n: Int): Int {
    var likes = 0
    var sharedPeople = 5
    for (i in 1..n) {
        val newAdvertisement = sharedPeople.div(2)
        likes += newAdvertisement
        sharedPeople = newAdvertisement.times(3)
    }

    return likes
}
