import java.util.Arrays;
import java.util.List;

public final class MyList {

    private MyList() { }

    /**
     * The method create the list from the integer values.
     * @param values Integer
     * @return List<Integer>
     */
    public static List<Integer> createList(final Integer... values) {
        return Arrays.asList(values);
    }

    /**
     * The method counts the average value in the integer list.
     * @param list List<Integer>
     * @return double
     */
    public static double calcAverageValue(final List<Integer> list) {
        long sum = 0;
        for (int i : list) {
            sum += i;
        }
        return list.size() > 0 ? (double) sum / list.size() : 0;
    }

    /**
     * The method compares two double numbers
     * and generates the result as a string.
     * @param value1 double
     * @param value2 double
     * @return String
     */
    public static String printResult(final double value1, final double value2) {
        String result;
        if (value1 > value2) {
            result = "Первый список имеет большее среднее значение: " + value1;
        } else if (value1 < value2) {
            result = "Второй список имеет большее среднее значение: " + value2;
        } else {
            result = "Средние значения списков равны";
        }
        return result;
    }
}
