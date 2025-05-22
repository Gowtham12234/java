class outerclass{
    int x=10;

    class innerclass{
        int y=20;
    }
}

public class Main{
    public static void main(String[] args) {
        outerclass myouter=new outerclass();
        outerclass.innerclass myinner=myouter.new innerclass();
        System.out.println(myouter.x+myinner.y);
    }
}
