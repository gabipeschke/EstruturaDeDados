package aula_15_16;

public class BTree {
    private BTNode root;

    public BTree(BTNode root) {
        this.root = root;
    }

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int numberNodes() {
        return numberNodes(root);
    }

    private int numberNodes(BTNode n){
        if(n == null) return 0;
        return 1+ numberNodes(n.getLeft()) + numberNodes(n.getRight());
    }

    public int depth() {
        return depth(root);
    }

    private int depth(BTNode n){
        if(n == null) return 0;
        return 1+ Math.max(depth(n.getLeft()), depth(n.getRight()));
    }

    public boolean contains( Integer value){
        return contains(root, value);
    }

    private boolean contains(BTNode n, Integer value){
        if(n==null) return false;
        if(n.getValue().equals(value)) return true;
        return contains(n.getLeft(), value) || contains(n.getRight(), value);
    }

    public void printInOrder() {
        System.out.println("InOrder:");
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(BTNode n){
        if(n==null) return;
        printInOrder(n.getLeft());
        System.out.println(" " + n.getValue());
        printInOrder(n.getRight());
    }
}
