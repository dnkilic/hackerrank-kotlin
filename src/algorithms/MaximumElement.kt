package algorithms

import java.util.*

fun maximumElement() {
    val scan = Scanner(System.`in`)
    val arCount = scan.nextLine().trim().toInt()
    val stack = arrayListOf<Int>()
    var maximum: Int? = null
    for (i in 0 until arCount) {
        val command = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
        when (command.first()) {
            1 -> {
                stack.add(0, command[1])
                if (maximum == null || maximum < command[1]) {
                    maximum = command[1]
                }
            }
            2 -> {
                val itemToRemove = stack[0]
                stack.removeAt(0)
                if (itemToRemove == maximum) {
                    maximum = stack.max()
                }
            }
            3 -> { println(maximum) }
        }
    }
}
