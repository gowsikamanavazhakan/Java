public class CompositeNumbers {
    public static void main(String[] args) {
        int[] array = {16, 18, 27, 16, 23, 21, 19};

        int count = countCompositeNumbers(array);
        System.out.println("Number of Composite Numbers = " + count);
    }

    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static int countCompositeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isComposite(num)) {
                count++;
            }
        }
        return count;
    }
}
