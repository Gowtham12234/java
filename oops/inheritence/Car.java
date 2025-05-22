class Vehicle{
    protected String brand ="ford";
    public void sound(){
        System.out.println("hrrrr,hrrr");
    }
}

//to inherit from a class ,use extends keyword..

class Car extends Vehicle{
    private String name="ford";//attribute of car..
    public static void main(String[] args) {
        Car mycar=new Car();
        mycar.sound();
        System.out.println(mycar.brand+" "+mycar.name);
    }

}