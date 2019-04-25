package interview.linkedlist

fun deleteNode(llist: SinglyLinkedListNode?, position: Int): SinglyLinkedListNode? {
    var head = llist
    for (i in 1 until position) {
        head = head?.next
    }

    val temp = head?.next
    val tail = temp?.next
    head?.next = tail
    return llist
}