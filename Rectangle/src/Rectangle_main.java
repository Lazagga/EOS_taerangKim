class Rectangle{
    int x1, y1, x2, y2;
    int h1, h2;
    int area_val;
    Rectangle(){}
    Rectangle(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.h1 = x2 - x1;
        this.h2 = y2 - y1;
        this.area_val = this.h1 * this.h2;
    }

    public void show(){
        System.out.println("x1 : " + x1 + ", y1 : " + y1 + ", x2 : " + x2 + ", y2 : " + y2);
        System.out.println("넓이 : " + area_val);
    }

    public void set(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.h1 = x2 - x1;
        this.h2 = y2 - y1;
        this.area_val = this.h1 * this.h2;
    }

    public boolean equals(Rectangle rec){
        if (this.h1 == rec.h1 && this.h2 == rec.h2){
            return true;
        }
        else return false;
    }

    public int square(){
        return this.area_val;
    }
}

public class Rectangle_main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(); // 인자가 없는 객체 생성
        Rectangle s = new Rectangle(1, 1, 2, 3); // 인자가 있는 객체 생성
        r.show();
        s.show();
        System.out.println(s.square());
        r.set(-2, 2, -1, 4);
        r.show();
        System.out.println(r.square());
        if (r.equals(s))
            System.out.println("두 사각형은 같습니다.");
    }
}
