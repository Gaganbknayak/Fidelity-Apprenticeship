package Question2;

import java.util.Scanner;

public class LinkedList1 {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head = null;
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the LinkedList: ");
        int size = sc.nextInt();
        System.out.println("Enter data values: ");
        for(int i = 0; i < size; i++){
            int data = sc.nextInt();
            list.insertAtHead(data);
        }
        System.out.println("Final LL: ");
        list.printList();
    }
}
