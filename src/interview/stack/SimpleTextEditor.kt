package interview.stack

import java.util.*

fun simpleTextEditor() {
    val scan = Scanner(System.`in`)
    val arCount = scan.nextLine().trim().toInt()
    var stack = ""
    val operations = mutableListOf<Pair<Int, String>>()
    for (i in 0 until arCount) {
        val input = scan.nextLine().split(" ")
        val command = input.first().toInt()
        val argument = input.last()
        when (command) {
            1 -> {
                operations.add(Pair(1, argument))
                stack += argument
            }
            2 -> {
                val droppedElements = stack.takeLast(argument.toInt())
                operations.add(Pair(2, droppedElements))
                stack = stack.removeSuffix(droppedElements)
            }
            3 -> { println(stack[argument.toInt() - 1]) }
            4 -> {
                val last = operations.last()
                if (last.first == 1) {
                    stack = stack.removeSuffix(last.second)
                } else {
                    stack += last.second
                }

                operations.removeAt(operations.lastIndex)
            }
        }
    }
}