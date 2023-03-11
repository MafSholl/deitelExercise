package DSAs.senseiQuestions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RomanToNumeral {

    public static void solution() {
        Map<String, Integer> romans = Stream.of(new Object[][] {
                {"I", 1},
                {"V", 5},
                {"X", 10},
                {"L", 50},
                {"C", 100},
                {"D", 500},
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1] ));

    }
    public static void main(String[] args) {
        solution();
    }
}
