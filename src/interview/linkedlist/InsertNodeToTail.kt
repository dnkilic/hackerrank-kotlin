package interview.linkedlist

fun insertNodeAtTail(head: SinglyLinkedListNode?, data: Int): SinglyLinkedListNode? {
    return if (head == null) {
        SinglyLinkedListNode(data, null)
    } else {
        var current = head
        while (current!!.next != null) {
            current = current.next
        }

        current.next = SinglyLinkedListNode(data, null)
        head
    }
}