package Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Task1Test {
    Task1 task;

    @BeforeEach
    public void init() {
        task = new Task1();
    }

    @Test
    public void isReturnTrueIfNumberIsEven() {
        Assertions.assertTrue(task.evenOddNumber(8));
    }

    @Test
    public void isReturnFalseIfNumberIsOdd() {
        Assertions.assertFalse(task.evenOddNumber(5));
    }
}
