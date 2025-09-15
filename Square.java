import java.util.*;
public class Square{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int b=a*a;
        System.out.println("Square of "+a+" is "+b);
        sc.close();
    }
    
}
