class Node {
int taskId;
Node next;

Node(int taskId) {
this.taskId = taskId;
this.next = null;
}
}

public class TaskQueue {

static Node removeTask(Node head, int taskId) {
if (head == null) {
return null;
}

if (head.taskId == taskId) {
return head.next;
}

Node prev = head;
Node curr = head.next;

while (curr != null && curr.taskId != taskId) {
prev = curr;
curr = curr.next;
}

if (curr != null) {
prev.next = curr.next;
}

return head;
}

static void display(Node head) {
Node temp = head;

while (temp != null) {
System.out.print(temp.taskId);

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

System.out.println("Task Queue before deletion:");
display(head);

head = removeTask(head, 102);

System.out.println("Task Queue after deletion:");
display(head);
}
}