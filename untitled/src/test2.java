class Rectangle{
    int x1, x2, y1, y2;
    int value;
    int h1, h2;

    Rectangle(){}

    Rectangle(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.h1 = x2 - x1;
        this.h2 = y2 - y1;
        value = h1 * h2;
    }

    void set(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.h1 = x2 - x1;
        this.h2 = y2 - y1;
        value = h1 * h2;
    }

    int square(){
        return value;
    }

    void show(){
        System.out.println("x1 : " + x1 + " ,x2 : " + x2 + " ,y1 : " + y1 + " ,y2 : " + y2);
        System.out.println("넓이 : " + value);
    }

    boolean equals(Rectangle r){
        return r.h1 == this.h1 && r.h2 == this.h2;
    }
}

public class test2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle s = new Rectangle(1, 1, 2, 3);

        r.show();
        s.show();
        System.out.println(s.square());
        r.set(-2, 2, -1, 4);
        r.show();
        System.out.println(r.square());
        if(r.equals(s)){
            System.out.println("두 사각형은 같습니다.");
        }
    }
}