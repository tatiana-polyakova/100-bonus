public class main {
    public static void main(String[] args) {
        float balance = 319;
        float refill = 1376;
        int percent = 0;

        if (refill > 1000) {
            percent = 1;
        }
        int result = (int) (refill / 100 * percent);
        System.out.println(result);
    }
}
