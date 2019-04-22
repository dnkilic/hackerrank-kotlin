package interview.linkedlist

fun printLinkedList(head: SinglyLinkedListNode) {
    var currentNode: SinglyLinkedListNode? = head
    while(currentNode != null) {
        println(currentNode.data)
        currentNode = currentNode.next
    }
}