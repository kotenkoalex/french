package com.kotenko.french.lesson.date;

import com.kotenko.french.lesson.Data;
import com.kotenko.french.lesson.ILesson;
import com.kotenko.french.lesson.DataUtils;

import java.util.List;

public class DateLesson implements ILesson<Integer> {
    @Override
    public void runLesson(List<Data<Integer>> data) {
        System.out.println(DataUtils.runLesson(data));
    }
}
