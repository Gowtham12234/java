interface Animal{
    public void sound();
    public void sleep();

}
// Pig "implements" the Animal interface
class Pig implements Animal {
  public void sound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.sound();
    myPig.sleep();
  }
}