import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyListTest {

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    final String result1 = "Первый список";
    final String result2 = "Второй список";
    final String result3 = "равны";

    @BeforeEach
    public void setUp() {
        list1 = Arrays.asList(1, 3, 5);
        list2 = Arrays.asList(0, 2, 4);
    }

    @Test
    public void testReturnsCorrectList() {
        list1 = Arrays.asList(1, 3, 5);
        Assertions.assertEquals(list1, MyList.createList(1, 3, 5));
    }

    @Test
    public void testReturnsCorrectAvgValue() {
        Assertions.assertEquals(3.0, MyList.calcAverageValue(list1));
    }

    @Test
    public void testIsPrintCorrectResultWhenTheAvgOfTheFirstListBigger() {
        double avg1 = MyList.calcAverageValue(list1);
        double avg2 = MyList.calcAverageValue(list2);

        assertThat(MyList.printResult(avg1, avg2)).contains(result1);
    }

    @Test
    public void testIsPrintCorrectResultWhenTheAvgOfTheSecondListBigger() {
        double avg2 = MyList.calcAverageValue(list1);
        double avg1 = MyList.calcAverageValue(list2);

        assertThat(MyList.printResult(avg1, avg2)).contains(result2);
    }

    @Test
    public void testIsPrintCorrectResultWhenTheAvgValuesAreEquals() {
        list2 = Arrays.asList(1, 3, 5);

        double avg2 = MyList.calcAverageValue(list1);
        double avg1 = MyList.calcAverageValue(list2);

        assertThat(MyList.printResult(avg1, avg2)).contains(result3);
    }

}
