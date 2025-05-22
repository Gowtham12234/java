public class Example{
    public static void main(String[] args) {
        int ages []={10,20,86,45,25,65,33};
        float avg=0;
        int sum=0;
        int length=ages.length;
        for(int age: ages){
            sum+=age;

        }
        avg=sum/length;
        System.out.println("average is "+avg);
    }
    

}