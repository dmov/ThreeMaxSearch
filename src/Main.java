import java.util.Arrays;

public class Main {
    static int[] searchThreeMax(final int[] array) {
        if (array.length < 3) {
            throw new IllegalStateException("The length of the array must be at least 3 elements");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int elem : array) {
            if (elem >= firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = elem;
            } else if (elem >= secondMax) {
                thirdMax = secondMax;
                secondMax = elem;
            } else if (elem >= thirdMax) {
                thirdMax = elem;
            }
        }

        return new int[]{firstMax, secondMax, thirdMax};
    }

    public static void main(String[] args) {
        final int[] array = new int[]{1, 2, 3, 4, 5, 11, 11, 10, 8};

        System.out.println(Arrays.toString(searchThreeMax(array)));
    }
}
