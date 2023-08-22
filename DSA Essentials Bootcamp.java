public class MaxDifference {

    public static int largestDifference(int[] arr) {
        if (arr.length < 2) {
            return 0; 
        }

        int minElement = arr[0];
        int maxDifference = 0;

        for (int num : arr) {
            int difference = num - minElement;
            maxDifference = Math.max(maxDifference, difference);
            minElement = Math.min(minElement, num);
        }

        return maxDifference;
    }

    public static void main(String[] args) {
        int[] arr = {7, 9, 5, 6, 3, 2};
        int output = largestDifference(arr);
        System.out.println(output);  
    }
}

