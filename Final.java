


// final variable can't be reassigned wwith any other value.
public class Final
{


    public static void main(String[] args) {

        int COST = 400;              //Declare variable
        System.out.println("Book cost is : " + COST);
        COST = 417;
        System.out.println("Updated Book cost is : " +COST);

        final  int PACKING = 40;   // Declare final key variable assigned.
        System.out.println("Packing fee :" + PACKING);

        PACKING = 76 ;
        System.out.println(PACKING);


    }
}