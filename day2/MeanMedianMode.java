import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MeanMedianMode {
    public static void main(String[] args) {
        int[] array = {16, 18, 27, 16, 23, 21, 19};

        double mean = calculateMean(array);
        System.out.println("Mean = " + mean);


        double median = calculateMedian(array);
        System.out.println("Median = " + median);


        int mode = calculateMode(array);
        System.out.println("Mode = " + mode);
    }

    public static double calculateMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static double calculateMedian(int[] array) {
        Arrays.sort(array);
        int middle = array.length / 2;
        if (array.length % 2 == 0) {
            double median1 = array[middle - 1];
            double median2 = array[middle];
            return (median1 + median2) / 2;
        } else {
            return array[middle];
        }
    }

    public static int calculateMode(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();


        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        int mode = 0;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }
}
