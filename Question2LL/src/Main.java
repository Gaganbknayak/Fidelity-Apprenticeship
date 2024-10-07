import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int index) {
        if (index < 0 || head == null) {
            System.out.println("Invalid index or list is empty");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        int counter = 0;

        while (current != null && counter < index) {
            previous = current;
            current = current.next;
            counter++;
        }

        if (current == null) {
            System.out.println("Index out of bounds");
        } else {
            previous.next = current.next;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.println("Enter 4 elements to add to the linked list:");
        for (int i = 0; i < 4; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }

        System.out.println("Linked list before removal:");
        list.display();

        System.out.print("Enter the index of the element to remove: ");
        int index = scanner.nextInt();

        list.remove(index);

        System.out.println("Linked list after removal:");
        list.display();
    }
}
