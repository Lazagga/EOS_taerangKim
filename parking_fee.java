public class parking_fee {
    public static void main(String[] args) {
        int fee_sum = 0;
        int[] arr = {5, 10, 12, 35, 60, 100, 300};
        for (int i = 0; i < 7; i ++) {
            if (arr[i] < 10) fee_sum += 0;
            else if (arr[i] < 30) fee_sum += 500;
            else {
                int fee = (arr[i] / 10 - 1) * 500;
                if (fee > 10000) fee = 10000;
                fee_sum += fee;
            }
        }
        System.out.printf("주차 요금 합계는 총 %d원입니다", fee_sum);
    }
}
