class Node {
int trackId;
Node next;

Node(int trackId) {
this.trackId = trackId;
this.next = null;
}
}

public class AddingATrackToPlayListQueue {

static Node insertAfter(Node current, int trackId) {
if (current == null) {
return null;
}

Node newNode = new Node(trackId);
newNode.next = current.next;
current.next = newNode;

return newNode;
}

static void display(Node head) {
Node temp = head;

while (temp != null) {
System.out.print(temp.trackId);

if (temp.next != null) {
System.out.print(" -> ");
}

temp = temp.next;
}

System.out.println();
}

public static void main(String[] args) {
Node head = new Node(101);
head.next = new Node(102);
head.next.next = new Node(103);
head.next.next.next = new Node(104);

System.out.println("Playlist before insertion:");
display(head);

Node current = head.next;

insertAfter(current, 105);

System.out.println("Playlist after insertion:");
display(head);
}
}