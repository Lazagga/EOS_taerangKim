class Currency{
    double val;
    String sign;

    public Currency(double val, String sign) {
        this.val = val;
        this.sign = sign;
    }

    public String toString(){
        return val + " " + sign;
    }
}

class KRW extends Currency{
    public KRW(double val, String sign) {
        super(val, sign);
    }

    public String toString() {
        return "KRW " + super.toString();
    }
}

class USD extends Currency{
    public USD(double val, String sign) {
        super(val, sign);
    }

    public String toString() {
        return "USD " + super.toString();
    }
}

class EUR extends Currency{
    public EUR(double val, String sign) {
        super(val, sign);
    }

    public String toString() {
        return "EUR " + super.toString();
    }
}

class JPY extends Currency{
    public JPY(double val, String sign) {
        super(val, sign);
    }

    public String toString() {
        return "JPY " + super.toString();
    }
}

public class Currency_Class {
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