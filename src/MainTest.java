import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MainTest {
    @Test
    public void searchThreeMaxTest() {
        assertArrayEquals(new int[]{}, Main.searchThreeMax(new int[]{}));
        assertArrayEquals(new int[]{7}, Main.searchThreeMax(new int[]{7}));
        assertArrayEquals(new int[]{2, 1}, Main.searchThreeMax(new int[]{2, 1}));
        assertArrayEquals(new int[]{2, 1}, Main.searchThreeMax(new int[]{1, 2}));
        assertArrayEquals(new int[]{5, 5}, Main.searchThreeMax(new int[]{5, 5}));

        assertArrayEquals(new int[]{1, 1, 1}, Main.searchThreeMax(new int[]{1, 1, 1}));
        assertArrayEquals(new int[]{0, 0, 0}, Main.searchThreeMax(new int[]{0, 0, 0, 0, 0}));
        assertArrayEquals(new int[]{5, -1, -1}, Main.searchThreeMax(new int[]{-1, 5, -1}));

        assertArrayEquals(new int[]{3, 2, 1}, Main.searchThreeMax(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{-1, -2, -3}, Main.searchThreeMax(new int[]{-1, -3, -2}));

        assertArrayEquals(new int[]{11, 10, 8}, Main.searchThreeMax(new int[]{1, 2, 3, 4, 5, 11, 10, 8}));
        assertArrayEquals(new int[]{11, 11, 10}, Main.searchThreeMax(new int[]{1, 2, 3, 4, 5, 11, 11, 10, 8}));

        assertArrayEquals(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE},
                Main.searchThreeMax(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE}));
        assertArrayEquals(new int[]{Integer.MIN_VALUE + 2, Integer.MIN_VALUE + 1, Integer.MIN_VALUE},
                Main.searchThreeMax(new int[]{Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 2, Integer.MIN_VALUE}));
    }
}