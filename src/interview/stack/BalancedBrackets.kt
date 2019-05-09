package interview.stack

// Complete the isBalanced function below.
fun isBalanced(input: String): String {

    val list = mutableListOf<Char>()
    for (char in input) {
        when (char) {
            '{', '[', '(' -> {
                list.add(0, char)
            }
            '}' -> {
                if (list.size > 0 && list.first() == '{') {
                    list.removeAt(0)
                } else {
                    return "NO"
                }
            }
            ']' -> {
                if (list.size > 0 && list.first() == '[') {
                    list.removeAt(0)
                } else {
                    return "NO"
                }
            }
            ')' -> {
                if (list.size > 0 && list.first() == '(') {
                    list.removeAt(0)
                } else {
                    return "NO"
                }
            }
        }
    }

    return if (list.size == 0) {
        "YES"
    } else {
        "NO"
    }
}