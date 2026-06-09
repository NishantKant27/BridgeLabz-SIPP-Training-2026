import java.util.Scanner;

public class celsiustoFahrenheitConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double temperature=sc.nextDouble();
        double converted_temprature=(temperature * 9/5)+ 32;
        System.out.print(converted_temprature);
    }   
}
