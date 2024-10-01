package Question5;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    // Function to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
        }
        System.out.println(); // New line after printing the list
    }

    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();

        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        ll.printList(head); // Print original list

        // Reverse the linked list
        ListNode reversedHead = ll.reverseList(head);

        System.out.println("Reversed Linked List:");
        ll.printList(reversedHead); // Print reversed list
    }
}
