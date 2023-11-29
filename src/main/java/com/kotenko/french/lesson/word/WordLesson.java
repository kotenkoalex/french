package com.kotenko.french.lesson.word;

import com.kotenko.french.lesson.Data;
import com.kotenko.french.lesson.ILesson;
import com.kotenko.french.lesson.DataUtils;

import java.util.List;

public class WordLesson implements ILesson<String> {
    @Override
    public void runLesson(List<Data<String>> data) {
        System.out.println(DataUtils.runLesson(data));
    }
}
