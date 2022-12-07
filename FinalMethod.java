
class Super{
    public void Display(){
        System.out.println("This is Super method");
    }
    final void FinalSuper(){
        System.out.println("This is final super class");
    }

}
class Sub extends Super{
    public void Display(){
        System.out.println("This is Sub method");
    }

    final void FinalSuper(){
        System.out.println("This is final super class");
    }

}
public class FinalMethod
{
    public static void main(String[] args) {
        Sub s= new Sub();
        s.Display();
        s.FinalSuper();
    }
}