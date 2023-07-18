package main;

/**
 * @sample [src\test\main\DollarTest.java]
 */
public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}



