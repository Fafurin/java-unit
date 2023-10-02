package Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListOperationsTest {
    @Test
    public void testSumLists() {
        Assertions.assertEquals(
                new ArrayList<>(Arrays.asList(5, 5, 5, 5)),
                ListOperations.sumLists(
                        new ArrayList<>(Arrays.asList(3, 5, 1, 4)),
                        new ArrayList<>(Arrays.asList(2, 0, 4, 1))),
                "Значения списков отличаются"
        );
    }

    @Test
    public void testFindMax() {
        assertEquals(5, ListOperations.findMax(new ArrayList<>(Arrays.asList(3, 5, 1, 4))),
                "Максимальное значение неверно"
        );
    }

    @Test
    public void testFilterStrings() {
        assertEquals(
                Arrays.asList("Second", "Fourth"),
                ListOperations.filterStrings(Arrays.asList("First", "Second", "Third", "Fourth"), 6),
                "Списки отличаются");
    }

}
