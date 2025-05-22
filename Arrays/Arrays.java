public class Arrays{
    public static  void main(String[] args){
        String[] cars={"volvo","bwm","toyayto","ford","tata"};
        
        int arr[]={10,20,30,40,50,60};
        for(int i=0;i<cars.length;i++){
            if(i==4){
                break;
            }
            System.out.println(cars[i]);
        }
    }
}