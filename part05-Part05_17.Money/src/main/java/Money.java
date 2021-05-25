
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        Money m = new Money(this.euros+addition.euros,this.cents+addition.cents);
        
        return m;
    }
    
    public boolean lessThan(Money compared){
        if (this.euros == compared.euros){
            return this.cents<compared.cents;
        }
        
        return this.euros<compared.euros;
    }
    
    public Money minus(Money decreaser){
        int currentCents=this.cents;
        int currentEuros=this.euros;
        if (this.cents<decreaser.cents){
            currentCents=100;
            currentEuros-=1;
        }
        Money m = new Money (currentEuros-decreaser.euros,currentCents-decreaser.cents);
        if (m.cents<0 || m.euros<0){
            Money mNeg = new Money(0,0);
            return mNeg;
        }
        return m;
    }

}
