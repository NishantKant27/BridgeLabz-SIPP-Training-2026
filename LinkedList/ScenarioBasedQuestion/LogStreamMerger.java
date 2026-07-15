class Node {
int timestamp;
Node next;

Node(int timestamp) {
this.timestamp = timestamp;
this.next = null;
}
}

public class LogStreamMerger {

static Node mergeLogStreams(Node a, Node b) {
Node dummy = new Node(0);
Node tail = dummy;

while (a != null && b != null) {
if (a.timestamp <= b.timestamp) {
tail.next = a;
a = a.next;
} else {
tail.next = b;
b = b.next;
}

tail = tail.next;
}

tail.next = (a != null) ? a : b;

return dummy.next;
}

static void display(Node head) {
Node temp = head;

while (temp != null) {
System.out.print(temp.timestamp);

if (temp.next != null) {
System.out.print(" -> ");
}

temp = temp.next;
}

System.out.println();
}

public static void main(String[] args) {
Node a = new Node(10);
a.next = new Node(30);
a.next.next = new Node(50);

Node b = new Node(20);
b.next = new Node(40);
b.next.next = new Node(60);

System.out.println("Log Stream 1:");
display(a);

System.out.println("Log Stream 2:");
display(b);

Node merged = mergeLogStreams(a, b);

System.out.println("Merged Log Stream:");
display(merged);
}
}