public class Main{
    static int sum(int a){
        if(a>0){
            return a+sum(a-1); //recursive call..
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int result =sum(10);
            System.out.println(result);

    }
}