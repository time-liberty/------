package seminar3.HW;

import java.util.ArrayList;
import java.util.Collections;

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(14);
        numbers.add(57);
        numbers.add(44);
        numbers.add(13);
        numbers.add(1);
        numbers.add(15);

        System.out.println("Список: " + numbers);

        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("Список без четных чисел: " + numbers);

        System.out.println("Список: " + numbers);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);

    }
}

