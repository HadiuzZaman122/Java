import java.util.*;
class Greater{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter 1st number");
int a = sc.nextInt();
System.out.println("Enter 2nd number");
int b = sc.nextInt();
if(a>b){

System.out.println(a+" is greater");
}
else if(b>a){
System.out.println(b+" is greater");
}
else{
System.out.println("Both are equal");
}
}

}