public class LinkedListInsertNode {

    /**
     * insert node in linked list
     * index 0 represent head , index 1 represent one node away from head
     * if given list is 1->2>3 and you want to insert node at position  2 with data 4
     * then new list would be  1 -> 2 ->4 ->3
     */
    public static void main(String[] args) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(1);
        insertNode(head,2,1);
    }

    private static void insertNode(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current_node = head;
        int index = 0;
        while(index < position -1 ) { // to get the current node where our node will be next
            current_node = current_node.next;
            index++;
        }
        new_node.next = current_node.next;
        current_node.next = new_node;
    }

}

class SinglyLinkedListNode {


    public SinglyLinkedListNode(int data) {
        this.data = data;
    }

    int data;
    SinglyLinkedListNode next;
}
