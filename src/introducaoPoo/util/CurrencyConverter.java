package introducaoPoo.util;

public class CurrencyConverter {
    public double price;

    public static double calculate(double price, int dollars) {
        return price * (dollars / 100.0);
    }
    public static double IOF(double price, int dollars) {
        return price * (dollars / 100.0);
    }

}
