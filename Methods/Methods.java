
import java.util.Scanner;

public class Methods{

    // function 1....

    static void mymethod(){
        System.out.println("hello you're in methods topic");
    }
    //function 2.....

    static void checkage(int age){
        if(age<18){
            System.out.println("there is no acces for you 'minor' " );
        }
        else{
            System.out.println("access granted 'major' ");
        }
        

    }
    //function 3....
    static int sum(int a,int b){
         return a+b;
         
    }

    public static void main(String []args){
        // calling function(method )
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkage(n);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sum(a,b));
        mymethod();
    }
}