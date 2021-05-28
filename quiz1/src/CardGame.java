import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.Scanner;

class Card {
    private int symbol;
    private int number;

    public Card (int symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public Card (Card aCard) {
        this.symbol = aCard.getSymbol();
        this.number = aCard.getNumber();
    }

    public int getNumber() {
        return number;
    }
    public int getSymbol() {
        return symbol;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setSymbol(int symbol) {
        this.symbol = symbol;
    }

    public boolean equals(Card anotherCard) {
        if (this.number == anotherCard.number && this.symbol == anotherCard.symbol) return true;
        else return false;
    }

    public String toString () {
        switch (this.symbol) {
            case 0:
                return "Clubs, " + this.number;
            case 1:
                return "Diamonds, " + this.number;
            case 2:
                return "Hearts, " + this.number;
            case 3:
                return "Spades, " + this.number;
            default:
                return null;
        }
    }

    public static int compareCard (Card CardA, Card CardB) {
        if (CardA.number > CardB.number) return -1;
        else if (CardA.number < CardB.number) return 1;
        else return 0;
    }
}

class Participant {
    private String name;
    private Card card;
    private int point;

    Random rand = new Random();

    public Participant(String name) {
        this.name = name;
        this.point = 0;
        this.card = new Card(rand.nextInt(4), rand.nextInt(13) + 1);
    }

    public Card getCard() {
        return card;
    }
    public int getPoint() {
        return point;
    }
    public String getName() {
        return name;
    }
    public void setCard(Card card) {
        this.card = new Card(card);
    }
    public void setPoint(int point) {
        this.point = point;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addPoint(int point) {
        this.point += point;
    }

    public void changeCard () {
        this.card.setSymbol(rand.nextInt(4));
        this.card.setNumber(rand.nextInt(13) + 1);
    }

    public String toString () {
        switch (this.card.getSymbol()) {
            case 0:
                return this.name + " has Clubs, " + this.card.getNumber() + "(point: " + this.point + ")";
            case 1:
                return this.name + " has Diamonds, " + this.card.getNumber() + "(point: " + this.point + ")";
            case 2:
                return this.name + " has Hearts, " + this.card.getNumber() + "(point: " + this.point + ")";
            case 3:
                return this.name + " has Spades, " + this.card.getNumber() + "(point: " + this.point + ")";
            default:
                return null;
        }
    }
}

public class CardGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Player name: ");
        Participant human1 = new Participant(scan.nextLine());
        Participant dealer = new Participant("Dealer");

        for (int i = 0; i < 3; i ++) {
            System.out.println("-----------------------");
            System.out.println(dealer.toString());
            System.out.println(human1.toString());

            if (Card.compareCard(human1.getCard(), dealer.getCard()) == -1) human1.addPoint(1);

            human1.setCard(dealer.getCard());

            dealer.changeCard();
        }

        System.out.println("-----------------------");
        System.out.println(human1.getName() + ", " + human1.getPoint() + " points");
    }
}
