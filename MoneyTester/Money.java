public class Money {
    private int dollars;
    private int cents;

    public Money(){
        dollars = 0;
        cents = 0;
    }

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money add(Money m) {
        int dollars = this.dollars + m.dollars;
        int cents = this.cents + m.cents;
        return new Money(dollars + cents / 100, cents % 100);
    }

    public Money subtract(Money m) {
        int dollars = this.dollars - m.dollars;
        int cents = this.cents - m.cents;
        dollars = dollars - 1;
        cents = 100 + cents;

        return new Money(dollars + cents / 100, cents % 100);
    }

    public Money multiply(int m){
        int dollars = this.dollars * m;
        int cents = this.cents * m;
        return new Money (dollars + cents /100, cents % 100);
    }

    public static Money[] multiply(Money[] moneys, int amt) {
        for (int i=0; i<moneys.length; i++ ){
            moneys[i].dollars = moneys[i].dollars * amt;
            moneys[i].dollars = moneys[i].dollars + 1;
            moneys[i].cents = moneys[i].cents * amt;
            moneys[i].cents = moneys[i].cents - 100;
        }
        return moneys;
    }

    public boolean equals(Money money)
    {
        return (dollars == money.dollars) && (cents == money.cents);
    }

    public String toString() {
        return dollars + "." + cents;
    }

    private void normalize(){
        if (cents > 99){
            dollars += cents / 100;
            cents %= 100;
        }
        if (cents < 0){
            dollars -= cents / 100;
            cents %= 100;
        }
    }
}
