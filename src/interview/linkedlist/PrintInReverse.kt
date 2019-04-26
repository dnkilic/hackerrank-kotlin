package interview.linkedlist

fun reversePrint(llist: SinglyLinkedListNode?) {
    val current = llist ?: return
    reversePrint(current.next)
    println(current.data)
}