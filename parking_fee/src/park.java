public class park {
    public static void main(String[] args) {
        int[] parking_time = {5, 10, 12, 35, 60, 100, 300};
        int fee_sum = 0;
        for (int i = 0; i < 7; i ++) {
            if (parking_time[i] < 10) fee_sum += 0;
            else if (parking_time[i] < 30) fee_sum += 500;
            else {
                int fee = (parking_time[i] / 10 - 1) * 500;
                if (fee > 10000) fee = 10000;
                fee_sum += fee;
            }
        }
        System.out.printf("주차 요금 합계는 총 %d원입니다.\n", fee_sum);
    }
}
