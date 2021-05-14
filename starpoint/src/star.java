public class star {
    public void star1(){
        for(int i = 0; i < 5; i ++) {
            for(int j = 0; j < i+1; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void star2(){
        for(int i = 0; i < 5; i ++) {
            for(int j = 5; j > i; j --) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void star3(){
        for(int i = 0; i < 5; i ++) {
            for(int j = 4; j > i; j --) {
                System.out.print(" ");
            }
            for(int j = 0; j < i+1; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void star4(){
        for(int i = 0; i < 5; i ++) {
            for(int j = 0; j < i; j ++) {
                System.out.print(" ");
            }
            for(int j = 5; j > i; j --) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void star5(){
        for(int i = 0; i < 5; i ++) {
            for(int j = 4; j > i; j --) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void star6(){
        for(int i = 0; i < 5; i ++) {
            for(int j = 0; j < i; j ++) {
                System.out.print(" ");
            }
            for(int j = 9; j > 2*i; j --) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void star7(){
        for(int i = 0; i < 5; i ++) {
            for(int j = 4; j > i; j --) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 1; i < 5; i ++) {
            for(int j = 0; j < i; j ++) {
                System.out.print(" ");
            }
            for(int j = 9; j > 2*i; j --) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void star8(){
        for(int i = 0; i < 5; i ++) {
            for(int j = 0; j < i; j ++) {
                System.out.print(" ");
            }
            for(int j = 9; j > 2*i; j --) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 1; i < 5; i ++) {
            for(int j = 4; j > i; j --) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void star9(){
        for(int i = 0; i < 5; i ++) {
            for(int j = 4; j > i; j --) {
                System.out.print("*");
            }
            for(int j = 0; j < 2*i+1; j ++) {
                System.out.print(" ");
            }
            for(int j = 4; j > i; j --) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 1; i < 5; i ++) {
            for(int j = 0; j < i; j ++) {
                System.out.print("*");
            }
            for(int j = 9; j > 2*i; j --) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void star10(){
        for(int i = 0; i < 5; i ++) {
            for(int j = 0; j < i; j ++) {
                System.out.print("*");
            }
            for(int j = 9; j > 2*i; j --) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 1; i < 5; i ++) {
            for(int j = 4; j > i; j --) {
                System.out.print("*");
            }
            for(int j = 0; j < 2*i+1; j ++) {
                System.out.print(" ");
            }
            for(int j = 4; j > i; j --) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        star s = new star();
        System.out.println("1");
        s.star1();
        System.out.println("2");
        s.star2();
        System.out.println("3");
        s.star3();
        System.out.println("4");
        s.star4();
        System.out.println("5");
        s.star5();
        System.out.println("6");
        s.star6();
        System.out.println("7");
        s.star7();
        System.out.println("8");
        s.star8();
        System.out.println("9");
        s.star9();
        System.out.println("10");
        s.star10();
    }
}
