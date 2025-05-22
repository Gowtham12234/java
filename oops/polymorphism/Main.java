class Animal{
    public void animalsound(){
        System.out.println("animal is supposed to do sound ");
    }
}

class Cat extends Animal{ //class cat is inherited from animal
    public void animalsound(){
     System.out.println("cat says : meow,meow");   
    }
}
class Dog extends Animal{
    public void animalsound(){
     System.out.println("dog says : baow baow");   
    }
}
class Main{
    public static void main(String[] args) {
        Animal myAnimal=new Animal();  //creating object of animal class
        Animal myCat=new Cat();        //creating object of Cat class
        Animal myDog=new Dog();         //creating object of Dog class
        myAnimal.animalsound();         //calling animalsound method ..
        myCat.animalsound();
        myDog.animalsound();
    }
}