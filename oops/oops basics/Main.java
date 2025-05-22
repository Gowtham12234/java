public class Main{
    int x=5;
    String fname="gowtham";
    String lname="boyina";
    public static void main(String[] args) {
        //object creation..

        Main myobj =new Main();
        //modifying object values
        myobj.x=40;
        System.out.println(myobj.x);
        System.out.println(myobj.fname +" "+myobj.lname);
    }
}