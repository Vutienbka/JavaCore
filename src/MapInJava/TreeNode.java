package MapInJava;

public class TreeNode<E> {
    protected   Integer element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode() {
    }

    public TreeNode(Integer element) {
        this.element = element;
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }
}
