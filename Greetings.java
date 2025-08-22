import java.util.*;
public class Greetings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name= sc.nextLine();
        System.out.println("Enter Age:");
        int a = sc.nextInt();
        System.out.println("Hello "+name+" is your age really "+a+" ?");
    }
}
