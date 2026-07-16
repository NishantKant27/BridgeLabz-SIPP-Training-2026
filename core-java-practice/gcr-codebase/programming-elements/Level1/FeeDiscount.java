import java.util.Scanner;

public class FeeDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.printf(
            "The discount amount is INR %.2f and final discounted fee is INR %.2f%n",
            discount, finalFee
        );
    }
}