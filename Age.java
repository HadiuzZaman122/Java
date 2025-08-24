import java.util.*;
public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Birth year");
        int by=sc.nextInt();
        System.out.println("Enter Current Year");
        int cy=sc.nextInt();
        int age=cy-by;
        System.out.println("AGE :"+age);
        sc.close();
    }
}
