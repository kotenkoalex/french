package com.kotenko.french.lesson;

import java.util.List;

public interface ILesson<T> {
    void runLesson(List<Data<T>> data);
}
