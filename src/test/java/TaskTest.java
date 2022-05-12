import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TaskTest {
    @Test
    public void testNums() {
        Task task = new Task();
        Assert.assertEquals(12, task.maxProduct(new int[]{3, 4, 5, 2}));
        Assert.assertEquals(16, task.maxProduct(new int[]{1, 5, 4, 5}));
        Assert.assertEquals(12, task.maxProduct(new int[]{3, 7}));
    }

    @Test
    public void testSquares() {
        Task task = new Task();
        Assert.assertArrayEquals(new int[]{0, 1, 9, 16, 100}, task.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
        Assert.assertArrayEquals(new int[]{4, 9, 9, 49, 121}, task.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }

    @After
    public void cleanUp() {
        System.setOut(null);
    }
}
