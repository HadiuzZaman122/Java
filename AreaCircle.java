import java.util.*;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pi=3.14f; //in java 3.14 is double float(64bit), hence 3.14f
        System.out.println("Enter the radius of the circle");
        float r=sc.nextFloat();
        float area=pi*r*r;
        System.out.println("Area of the cirle with Radius "+r+" is :"+area);
        sc.close();
    }
}
