class Currency{
    double val;
    String sign;
    public Currency(){}
}

class KRW extends Currency{
    public KRW(double val, String sign) {
        super(val, sign);
    }

    public String toString() {
        return "KRW " + this.val + " " + this.sign;
    }
}

class USD extends Currency{
    public USD(double val, String sign) {
        super(val, sign);
    }

    public String toString() {
        return "USD " + this.val + " " + this.sign;
    }
}

class EUR extends Currency{ String sign;
    public EUR(double val, String sign) {
        super(val, sign);
    }

    public String toString() {
        return "EUR " + this.val + " " + this.sign;
    }
}

class JPY extends Currency{
    public JPY(double val, String sign) {
        super(val, sign);
    }

    public String toString() {
        return "JPY " + this.val + " " + this.sign;
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
