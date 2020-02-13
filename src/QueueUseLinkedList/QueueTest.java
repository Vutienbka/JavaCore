package QueueUseLinkedList;

public class QueueTest {
    public static void main(String[] args) {
      ;
        QueueUseLinkedList nodeList = new QueueUseLinkedList();
        Person person1 = new Person(25, "VU HOANG NAM");
        Person person2 = new Person(30, "PHAM GIA BAO");
        Person person3 = new Person(30, "PHAM GIA BAO");
        Node node1 = new Node(person1);
        Node node2 = new Node(person2);
        Node node3 = new Node(person3);
        nodeList.addQueue(node1);
        nodeList.addQueue(node2);
        nodeList.addQueue(node3);
        nodeList.printList();
//        for(int i = 0; i<=2; i++)
//            nodes[i] = nodeList.deQueue();
//        for(int i = 0; i<=2; i++)
//            System.out.println(nodes[i].person.getAge() + " " + nodes[i].person.getName());
    }
}
