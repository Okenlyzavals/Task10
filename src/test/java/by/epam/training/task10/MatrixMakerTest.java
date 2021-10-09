package by.epam.training.task10;

import org.junit.Assert;
import org.junit.Test;

public class MatrixMakerTest {

    @Test
    public void MatrixCreationTest() {
        int order = 2;
        int[][] expectedMatrix = {{1, 2}, {2, 1}};

        int[][] testedMatrix = MatrixMaker.makeMatrix(order);

        Assert.assertArrayEquals(expectedMatrix, testedMatrix);

    }

    @Test(expected = NegativeArraySizeException.class)
    public void MatrixWithNegativeOrderTest() {
        int negativeOrder = -5;

        MatrixMaker.makeMatrix(negativeOrder);
    }

}