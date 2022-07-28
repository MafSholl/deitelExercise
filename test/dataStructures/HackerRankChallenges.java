package dataStructures;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HackerRankChallenges {

    public static BigInteger extraLongFactorial (int number){
        BigInteger solution = BigInteger.ONE;

//        IntStream.rangeClosed(number, 2).;
//        if (number >= 1 && number <= 100) {
//            for (int i = number; i > 1; i--) {
//                solution = solution.multiply(BigInteger.valueOf(i));
//            }
//            return solution;
//        }
        return BigInteger.valueOf(-1);
    }

    public static int tripleSum() {
        return IntStream.rangeClosed(3, 20).filter(x -> (x%3 == 0)).map(x -> x*3).sum();
    }

    public static void question17() {
        String input = new Scanner(System.in).nextLine();
        input = input.toLowerCase();

        String[] elements = input.split(" ");

        List<String> stringList= Stream.of(elements)
                .sorted()
                .distinct()
                .toList();
    }

    public static void question17_13(){
        SecureRandom secureRandom = new SecureRandom();
        IntStream stream = secureRandom.ints(10, 0, 1001);
        List<Integer> list = stream.boxed().toList();

        Long evenCount = stream.filter(x -> x%2 == 0)
                                .count();

        Long oddCount = stream.filter(x -> x%2 == 1)
                                .count();

        double evenAverage = stream.filter(x -> x%2 == 0).average().getAsDouble();
        double evenAverage1 = stream.filter(x -> x%2 == 0).average().orElse(0);
        double evenAverage2 = (list.stream()
                                .filter(x -> x%2 == 0)
                                .reduce(0, Integer::sum)*1.0)/evenCount;

        double oddAverage = list.stream()
                                .filter(x -> x%2== 1)
                                .reduce(0, (x, y) -> x+y);

//        double evenAverage1 = stream.filter(x -> x%2 == 0).average().ifPresent(element -> System.out.println(element));
//        double oddAverage1 = list.stream()
//                                .filter(x -> x%2 == 1)
//                                .reduce((x, y) -> x+y);
//        double allAverage =
    }

    public static void main(String[] args) {
//        System.out.println(extraLongFactorial(25));
//        System.out.println(tripleSum());
    }
}
