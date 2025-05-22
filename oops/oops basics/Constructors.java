public class Constructors{
    int modelyear;
    String carName;

    public Constructors(int year,String Name){
            modelyear=year;
            carName=Name;
    }
    public static void main(String[] args) {
        Constructors mycar=new Constructors(1960,"benz");
        System.out.println(mycar.modelyear + " "+mycar.carName);
    }
}