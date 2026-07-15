class Node {
String page;
Node next;

Node(String page) {
this.page = page;
this.next = null;
}
}

public class BrowserHistory {

static Node reverseHistory(Node head) {
Node prev = null;
Node curr = head;

while (curr != null) {
Node next = curr.next;
curr.next = prev;
prev = curr;
curr = next;
}

return prev;
}

static void display(Node head) {
Node temp = head;

while (temp != null) {
System.out.print(temp.page);

if (temp.next != null) {
System.out.print(" -> ");
}

temp = temp.next;
}

System.out.println();
}

public static void main(String[] args) {
Node head = new Node("Google");
head.next = new Node("YouTube");
head.next.next = new Node("GitHub");
head.next.next.next = new Node("LinkedIn");

System.out.println("Browser History before reversal:");
display(head);

head = reverseHistory(head);

System.out.println("Browser History after reversal:");
display(head);
}
}