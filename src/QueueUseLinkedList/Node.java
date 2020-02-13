package QueueUseLinkedList;

public class Node {
    public Person person;
    public Node next;

    public Node(Person person){
        this.person = person;
        this.next = null;
    }
}
