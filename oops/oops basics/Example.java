public class Example{
    static  void fullthrotle(){
        System.out.println("the car is on full throthle");
    }
    public void speed(int maxspeed){
        System.out.println("max speed is: "+maxspeed);
    }
    public static void main(String[] args) {
        fullthrotle();//static method doesnt require creating object..

        Example mycar=new Example();
        mycar.speed(200);//public method..
    }
}