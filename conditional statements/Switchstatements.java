import java.util.*;
public class Switchstatements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch (day){
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;
            
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("enter in the range of 1 to 3");
                break;

        }
    }
}