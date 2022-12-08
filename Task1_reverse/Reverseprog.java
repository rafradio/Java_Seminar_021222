public class Reverseprog {
    static LinkedListNode head;
    static class LinkedListNode {
        int val;
        LinkedListNode next;
        LinkedListNode(int data) {
            val = data;
            next = null;
        }
        // void printList() {

        // }
    }
    LinkedListNode reverse(LinkedListNode node) {
        LinkedListNode previous = null;  
        LinkedListNode curr = node;  
        
        LinkedListNode next = null; 

        while (curr != null) {
            next = curr.next;  
            curr.next = previous;  
            previous = curr;  
            curr = next; 

        }
        // next = curr.next;
        // curr.next = previous;
        // previous = curr;
        // curr = next;

        LinkedListNode node1 = previous;
        return node1;
    }
    void printList(LinkedListNode nde) {
        while (nde != null) {
            System.out.print(nde.val + " ");
            nde = nde.next;
        }
    }
    public static void main(String[] args) {
        Reverseprog listObj = new Reverseprog();
        listObj.head = new LinkedListNode(4);
        listObj.head.next = new LinkedListNode(6);
        // listObj.head.next.next = new LinkedListNode(9);
        listObj.printList(listObj.head);
        System.out.println("\n");
        listObj.head = listObj.reverse(listObj.head);
        listObj.printList(listObj.head);

    }
}
