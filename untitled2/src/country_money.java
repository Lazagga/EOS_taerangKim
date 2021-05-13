class Currency{
    String name;
    public Currency(String name){
        this.name = name;
    }
}

class KRW extends Currency{
    double val;
    String sign;
    public KRW(double val, String sign) {
        super("KRW");
        this.val = val;
        this.sign = sign;
    }

    public String toString() {
        return this.name + " " + this.val + " " + this.sign;
    }
}

class USD extends Currency{
    double val;
    String sign;
    public USD(double val, String sign) {
        super("USD");
        this.val = val;
        this.sign = sign;
    }

    public String toString() {
        return this.name + " " + this.val + " " + this.sign;
    }
}

class EUR extends Currency{
    double val;
    String sign;
    public EUR(double val, String sign) {
        super("EUR");
        this.val = val;
        this.sign = sign;
    }

    public String toString() {
        return this.name + " " + this.val + " " + this.sign;
    }
}

class JPY extends Currency{
    double val;
    String sign;
    public JPY(double val, String sign) {
        super("JPY");
        this.val = val;
        this.sign = sign;
    }

    public String toString() {
        return this.name + " " + this.val + " " + this.sign;
    }
}

public class country_money {
    public static void main(String[] args) {
        KRW krw = new KRW(1500, "원");
        USD usd = new USD(100.5, "달러");
        EUR eur = new EUR(260.87, "유로");
        JPY jpy = new JPY(1400, "엔");

        Currency[] currencies = { krw, usd, eur, jpy };

        for (Currency c : currencies) {
            System.out.println(c.toString());
        }
    }
}
