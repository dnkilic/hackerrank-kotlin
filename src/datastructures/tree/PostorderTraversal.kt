package datastructures.tree

fun postOrder(root: Node) {
    if (root.left != null) {
        postOrder(root.left!!)
    }

    if (root.right != null) {
        postOrder(root.right!!)
    }

    print(root.data)
    print(" ")
}