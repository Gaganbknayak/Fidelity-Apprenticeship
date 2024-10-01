package Question1;

import java.util.Scanner;

public class LinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head = null;

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void printList(){
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();
        System.out.println("Enter the data values: ");
        for(int i = 0; i < size; i++) {
            int value = sc.nextInt();
            list.insertAtTail(value);
        }
        System.out.println("Final Linked List:  ");
        list.printList();
    }
}
