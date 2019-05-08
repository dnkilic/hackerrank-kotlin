package interview.stack

import java.util.*

fun queueUsingTwoStacks() {
    val scan = Scanner(System.`in`)
    val arCount = scan.nextLine().trim().toInt()
    val stack = arrayListOf<Int>()
    for (i in 0 until arCount) {
        val command = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
        when (command.first()) {
            1 -> stack.add(command[1])
            2 -> stack.removeAt(0)
            3 -> println(stack[0])
        }
    }
}
