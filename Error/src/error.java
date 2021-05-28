import java.util.Scanner;

class IndexOutOfBoundsException extends Exception {
    public IndexOutOfBoundsException() {
        super("에러발생");
    }
}

public class error {
    static int[] arr = {0, 1, 2, 3, 4, 5};

    public static int call(int n) throws IndexOutOfBoundsException {
        if (n < 0 || n > 5) throw new IndexOutOfBoundsException();

        return arr[n];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        try {
            System.out.println("call value : " + call(n));
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("해당 문장은 무조건 수행");
        }
    }

}
