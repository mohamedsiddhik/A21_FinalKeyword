
final class FinalClass2 {
    public  void finals(){
        System.out.println("Hi from final class");
    }

}
class  FinalClass3 extends  FinalClass2{
    public void subfinal(){
        System.out.println("Hi from sub final class ");
    }
}



public class FinalClass
{
    public static void main(String[] args) {
        FinalClass3 f3 = new FinalClass3();
        f3.finals();
        f3.subfinal();

    }
}