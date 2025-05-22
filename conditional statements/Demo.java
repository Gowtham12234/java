import java.util.*;
public class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            System.out.println("positive");
        }
        else if(num==0){
            System.out.println("you had enterd zero");
        }
        else{
            System.out.println("number is negative");
        }
    }
}