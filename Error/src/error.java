import java.util.Scanner;

public class error {
    static int[] arr = {0, 1, 2, 3, 4, 5};

    public static int call(int n) {
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        try {
            System.out.println(call(n));
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("에러발생");
        }
        finally {
            System.out.println("해당 문장은 무조건 수행");
        }
    }
}
