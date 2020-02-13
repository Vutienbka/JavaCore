package QueueStack;

import QueueUseLinkedList.Person;

public class Node {
    public Student student;
    public Node next;

    public Node(Student student){
        this.student = student;
        this.next = null;
    }
}
