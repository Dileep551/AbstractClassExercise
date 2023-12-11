public class Main {
    public static void main(String[] args) {
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");
        Node node4 = new Node("D");

        MyLinkedList linkedList = new MyLinkedList(node2);
        linkedList.addItem(node1);
        linkedList.addItem(node4);
        linkedList.addItem(node3);

        System.out.println("Linked List:");
        linkedList.traverse(linkedList.getRoot());

        System.out.println("\nRemoving item '3' from Linked List:");
        linkedList.removeItem(node3);
        linkedList.traverse(linkedList.getRoot());

        SearchTree searchTree = new SearchTree(node4);
        searchTree.addItem(node1);
        searchTree.addItem(node2);
        searchTree.addItem(node3);

        System.out.println("\nSearch Tree (Inorder Traversal):");
        searchTree.traverse(searchTree.getRoot());

        System.out.println("\nRemoving item '2' from Search Tree:");
        searchTree.removeItem(node2);
        searchTree.traverse(searchTree.getRoot());
    }
}