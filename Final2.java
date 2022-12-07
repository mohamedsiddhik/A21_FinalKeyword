
// 2. the final method can't be overridden.

class PayBills{
    void  payment(int amount){
        System.out.println("Send money home, recjarge mobile , and so on");
    }
}

class GooglePay extends PayBills{
    void  payment(int amount){
        System.out.println("QR Code");
    }
}

class Paytm extends GooglePay{
    void payment(int amount){
        System.out.println("Do direct bank to bank transfer");
    }
}

public class Final2
{

    public static void main(String[] args) {
         Paytm p = new Paytm();
         p.payment(66);

    }
}