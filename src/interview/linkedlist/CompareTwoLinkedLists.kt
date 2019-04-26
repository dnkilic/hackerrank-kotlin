package interview.linkedlist

fun compareLists(head1: SinglyLinkedListNode, head2: SinglyLinkedListNode): Boolean {
    var first: SinglyLinkedListNode? = head1
    var second: SinglyLinkedListNode? = head2

    while (first != null && second != null) {
        if (first.data != second.data) {
            return false
        }

        first = first.next
        second = second.next

        if (first != null && second == null) {
            return false
        } else if (first == null && second != null) {
            return false
        }
    }

    return true
}