

public class FinalVariable
{
    final int MIN = 1;
    final int NORMAL;
    final int MAX;

    FinalVariable(int normal, int max) {
        NORMAL = normal;
        MAX = max;
    }
    void display(){
        System.out.println("MIN : " + MIN);
        System.out.println("NORMAL : " + NORMAL);
        System.out.println("MAX : " + MAX);
    }

    public static void main(String[] args) {
        FinalVariable fv = new FinalVariable(55,88);
        fv.display();

    }
}