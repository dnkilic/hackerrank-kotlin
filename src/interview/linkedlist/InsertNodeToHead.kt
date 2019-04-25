package interview.linkedlist

fun insertNodeAtHead(llist: SinglyLinkedListNode, data: Int): SinglyLinkedListNode {
   val newNode = SinglyLinkedListNode(data)
   newNode.next = llist
   return newNode
}