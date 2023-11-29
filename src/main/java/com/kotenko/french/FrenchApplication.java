package com.kotenko.french;

import com.kotenko.french.lesson.date.DateDao;
import com.kotenko.french.lesson.digit.DigitDao;
import com.kotenko.french.lesson.digit.DigitLesson;
import com.kotenko.french.lesson.digit.DigitService;
import com.kotenko.french.lesson.Data;
import com.kotenko.french.lesson.IDataDao;
import com.kotenko.french.lesson.ILesson;
import com.kotenko.french.lesson.word.WordDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class FrenchApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrenchApplication.class, args);

        IDataDao dao;
        int i = new Random().nextInt(3);
        switch (i){
            case 0 -> dao = new DigitDao();
            case 1 -> dao = new DateDao();
            default -> dao = new WordDao();
        }
        DigitService service = new DigitService(dao);
        List<Data> data = service.getData();
        ILesson lesson = new DigitLesson();
        lesson.runLesson(data);
    }
}
