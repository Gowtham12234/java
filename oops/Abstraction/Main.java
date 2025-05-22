abstract class Animal{
    public abstract void animalsound();
    public void sleep(){
        System.err.println("zzzz");
    }
}
// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalsound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalsound();
    myPig.sleep();
  }
}