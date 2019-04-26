package datastructures.tree

fun inOrder(root: Node) {
    if (root.left != null) {
        inOrder(root.left!!)
    }

    print(root.data)
    print(" ")

    if (root.right != null) {
        inOrder(root.right!!)
    }
}