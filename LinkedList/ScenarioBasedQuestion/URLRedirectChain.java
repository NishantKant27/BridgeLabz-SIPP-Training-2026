class Node {
String url;
Node next;

Node(String url) {
this.url = url;
this.next = null;
}
}

public class URLRedirectChain {

static boolean hasRedirectLoop(Node head) {
Node slow = head;
Node fast = head;

while (fast != null && fast.next != null) {
slow = slow.next;
fast = fast.next.next;

if (slow == fast) {
return true;
}
}

return false;
}

public static void main(String[] args) {
Node urlA = new Node("URL-A");
Node urlB = new Node("URL-B");
Node urlC = new Node("URL-C");
Node urlD = new Node("URL-D");

urlA.next = urlB;
urlB.next = urlC;
urlC.next = urlD;
urlD.next = urlB;

boolean result = hasRedirectLoop(urlA);

if (result) {
System.out.println("Redirect loop detected");
} else {
System.out.println("No redirect loop detected");
}
}
}