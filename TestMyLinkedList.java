public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("======== Test ========");
        MyLinkedList ll = new MyLinkedList(10); // head = 10 at first
        ll.addFirst(11);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,789);
        ll.printList();
    }
}
