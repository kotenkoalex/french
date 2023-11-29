package com.kotenko.french.lesson;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DataUtils {
    public static <T> boolean runLesson(List<Data<T>> data) {
        boolean correctSpelling = false;
        int i;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            i = new Random().nextInt(10);
            T question = data.get(i).getQuestion();
            System.out.println("Comme ça s'écrit: " + question);
            String answer = scanner.nextLine();
            if (answer.equals("exit")) {
                break;
            }
            correctSpelling = isCorrectSpelling(question, answer, data);
        }
        return correctSpelling;
    }

    public static <T> boolean isCorrectSpelling(T question, String answer, List<Data<T>> data) {
        Data<T> digit = data.stream()
                .filter(it -> it.getQuestion().equals(question))
                .findFirst()
                .orElse(new Data<>(null, "default"));
        return digit.getAnswer().equals(answer);
    }
}
