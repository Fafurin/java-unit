package Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Task2Test {
    Task2 task;

    @BeforeEach
    public void init() {
        task = new Task2();
    }

    @Test
    public void isReturnTrueIfNumberInTheInterval() {
        Assertions.assertTrue(task.numberInInterval(45));
    }

    @Test
    public void isReturnTrueIfNumberNotInTheInterval() {
        Assertions.assertFalse(task.numberInInterval(1));
    }
}
