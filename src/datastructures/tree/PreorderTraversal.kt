package datastructures.tree

fun preOrder(root: Node) {
    print(root.data)
    print(" ")
    if (root.left != null) {
        preOrder(root.left!!)
    }

    if (root.right != null) {
        preOrder(root.right!!)
    }
}
