package com.kotenko.french;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FrenchApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrenchApplication.class, args);

//        IDataDao dao;
//        int i = new Random().nextInt(3);
//        switch (i){
//            case 0 -> dao = new DigitDao();
//            case 1 -> dao = new DateDao();
//            default -> dao = new WordDao();
//        }
//        DigitService service = new DigitService(dao);
//        List<Data> data = service.getData();
//        ILesson lesson = new DigitLesson();
//        lesson.runLesson(data);
    }
}
