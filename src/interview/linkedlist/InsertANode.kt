package interview.linkedlist

fun insertNodeAtPosition(llist: SinglyLinkedListNode?, data: Int, position: Int): SinglyLinkedListNode? {
    var current = llist
    for (i in 0 until position - 1) {
        current = current?.next
    }

    val newNode = SinglyLinkedListNode(data)
    newNode.next = current?.next
    current?.next = newNode

    return llist
}