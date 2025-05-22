public class Main{
    /*
    method overloading means multiple methods has same name but different parameters.....
     */
    static int plus(int x,int y){
        return x+y;
    }
    static double plus(double x,double y){
        return x+y;
    }
    public static void main(String[]args){
        //method overloading..
    System.out.println(plus(4,5));
    System.out.println(plus(4.22,5.33));



    }
}