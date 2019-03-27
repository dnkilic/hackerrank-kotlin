package algorithms


// Complete the minimumNumber function below.
fun minimumNumber(n: Int, password: String): Int {
    // Return the minimum number of characters to make the password strong

    val specialCharacters = "!@#$%^&*()-+"

    var sizeRequirementSatisfied = false
    var digitRequirementSatisfied = 0
    var lowerCaseRequirementSatisfied = 0
    var upperCaseRequirementSatisfied = 0
    var specialCharacterRequirementSatisfied = 0
    var count = 0

    for (i in password.indices) {
        count++

        if (password[i].isLowerCase()) {
            lowerCaseRequirementSatisfied = 1
        }

        if (password[i].isUpperCase()) {
            upperCaseRequirementSatisfied = 1
        }

        if (password[i].isDigit()) {
            digitRequirementSatisfied = 1
        }

        if (specialCharacters.contains(password[i], false)) {
            specialCharacterRequirementSatisfied = 1
        }

        if (count > 6) {
            sizeRequirementSatisfied = true
        }

        if (lowerCaseRequirementSatisfied + upperCaseRequirementSatisfied + digitRequirementSatisfied +
                specialCharacterRequirementSatisfied == 4 && sizeRequirementSatisfied) {
            break
        }
    }

    val unSatisfiedRequirements = 4 - lowerCaseRequirementSatisfied - upperCaseRequirementSatisfied -
            digitRequirementSatisfied - specialCharacterRequirementSatisfied
    return if (sizeRequirementSatisfied) {
        unSatisfiedRequirements
    } else {
        val size = 6 - n
        if (size > unSatisfiedRequirements) {
            size
        } else {
            unSatisfiedRequirements
        }
    }
}