public class Main {
    public static void main(String[] args) {
        int[] weights = {59, 60, 62, 65, 63, 67, 70, 68, 69, 0, 0, 0};
        int[] weightsCopy = {75, 60, 62, 65, 63, 67, 70, 68, 69, 0, 0, 0};
        int JanuaryWeight = weights[0];
        System.out.println(JanuaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[5]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
        for (int i = 0; i < weightsCopy.length; i++) {
            System.out.println(weightsCopy[i]);
        }
        int maxWeight = -1;
        for (final int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
    }
}