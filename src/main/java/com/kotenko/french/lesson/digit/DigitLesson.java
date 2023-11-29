package com.kotenko.french.lesson.digit;

import com.kotenko.french.lesson.Data;
import com.kotenko.french.lesson.ILesson;
import com.kotenko.french.lesson.DataUtils;

import java.util.List;

public class DigitLesson implements ILesson<Integer> {
    @Override
    public void runLesson(List<Data<Integer>> data) {
        System.out.println(DataUtils.runLesson(data));
    }
}
