public class TryAndCatchBlock {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
        System.out.println("Rest of the code executes...");
    }
}
