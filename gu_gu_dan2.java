public class gu_gu_dan2 {
    public static void main(String[] args) {
        int i = 1, j = 1;
        while (i < 10) {
            while (j < 10) {
                System.out.printf("%d * %d= %d\n", i, j, i*j);
                j++;
            }
            j = 1;
            i++;
        }
    }
}
