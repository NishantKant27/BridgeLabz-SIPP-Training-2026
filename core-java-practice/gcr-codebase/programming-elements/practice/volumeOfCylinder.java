import java.util.Scanner;

public class volumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        double radius=sc.nextInt();
        double height=sc.nextInt();
        double Volume = 3.14*radius*radius*height;
        System.out.print("Volume of Cylinder:"+Volume);
    }
}
