public class Task {
    public static int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;
        int secondMax = max;

        for (int number : nums) {
            if (max < number) {
                secondMax = max;
                max = number;
            } else if (secondMax < number) {
                secondMax = number;
            }
        }
        return (max - 1) * (secondMax - 1);
    }

    public int[] sortedSquares(int[] array) {

        int[] result = new int[array.length];
        int s = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k < array.length; k++) {
            if (array[k] < 0) {
                j++;
            }
            array[k] = array[k] * array[k];
        }
        i = j - 1;
        while (i >= 0 && j <= array.length - 1) {
            if (array[i] < array[j]) {
                result[s] = array[i];
                i--;
            } else {
                result[s] = array[j];
                j++;
            }
            s++;
        }
        while (i >= 0) {
            result[s] = array[i];
            i--;
            s++;
        }
        while (j <= array.length - 1) {
            result[s] = array[j];
            j++;
            s++;
        }
        return result;
    }
}
