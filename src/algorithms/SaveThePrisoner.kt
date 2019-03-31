package algorithms

// Complete the saveThePrisoner function below.
fun saveThePrisoner(prisonerCount: Int, sweats: Int, firstChair: Int): Int {
    val indexOfUnluckyPrisoner = (sweats % prisonerCount) + firstChair - 1
    return if (indexOfUnluckyPrisoner == 0) {
        prisonerCount
    } else {
        if (indexOfUnluckyPrisoner % prisonerCount == 0) {
            indexOfUnluckyPrisoner
        } else{
            indexOfUnluckyPrisoner % prisonerCount
        }
    }
}