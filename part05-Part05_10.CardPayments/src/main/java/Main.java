
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        
        PaymentCard pc = new PaymentCard(10);
        
        System.out.println("Money rn: "+pc.balance());
        boolean didWithdrawal = pc.takeMoney(8);
        System.out.println("Was withdrawn?: "+didWithdrawal);
        System.out.println("Balance: "+pc.balance());
        
        didWithdrawal = pc.takeMoney(8);
        System.out.println("Was withdrawn?: "+didWithdrawal);
        System.out.println("Balance: "+pc.balance());
    }
}

