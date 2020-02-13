package QueueStack;


public class QueueLinkedList {
    private Node head;
    private Node tail;

    public void QueueUseLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void addQueue(Student student){
        Node temp = new Node(student);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node deQueue() {
        if (this.head == null)
            return null;
            Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.student.getName() + temp.student.getGender());
            temp = temp.next;
        }
    }
}
