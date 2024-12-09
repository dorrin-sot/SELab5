public class NewCode {
    public static void main(String[] args) {
        mainSleep();
        System.out.println("Started");
        findSumsOfAllNumbers(200000);
        System.out.println("Ended");
        mainSleep();
    }

    private static void mainSleep() {
        for (int i = 0; i < 500; i++) {
            Utils.sleepUninterrruptable(0.01);
        }
    }

    private static void findSumsOfAllNumbers(int n) {
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = 0;
            for (int j = 1; j <= i; j++)
                arr[i - 1] += j;
        }
    }
}
