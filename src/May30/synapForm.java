package May30;

public class synapForm {

    public static void main(String[] args) {
        int[] moneyUnits = {100000, 50000, 10000, 1000, 100, 10};
        int targetAmount = 100000;
        findCombinations(moneyUnits, targetAmount);
    }
    public static void findCombinations(int[] units, int target) {
        int count = 0; // 경우의 수를 세는 변수
        for (int i = 0; i <= target / units[0]; i++) {
            int remainingAfterI = target - i * units[0];
            if (remainingAfterI < 0) break;
            for (int j = 0; j <= remainingAfterI / units[1]; j++) {
                int remainingAfterJ = remainingAfterI - j * units[1];
                if (remainingAfterJ < 0) break;
                for (int k = 0; k <= remainingAfterJ / units[2]; k++) {
                    int remainingAfterK = remainingAfterJ - k * units[2];
                    if (remainingAfterK < 0) break;
                    for (int l = 0; l <= remainingAfterK / units[3]; l++) {
                        int remainingAfterL = remainingAfterK - l * units[3];
                        if (remainingAfterL < 0) break;
                        for (int m = 0; m <= remainingAfterL / units[4]; m++) {
                            int remainingAfterM = remainingAfterL - m * units[4];
                            if (remainingAfterM < 0) break;
                            for (int n = 0; n <= remainingAfterM / units[5]; n++) {
                                int remainingAfterN = remainingAfterM - n * units[5];
                                if (remainingAfterN < 0) break;
                                if (remainingAfterN == 0) {
                                    count++;
                                    System.out.println("100000원: " + i + "개, 50000원: " + j + "개, 10000원: " + k + "개, 1000원: " + l + "개, 100원: " + m + "개, 10원: " + n + "개");
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("총 경우의 수: " + count + "개");
    }
}

