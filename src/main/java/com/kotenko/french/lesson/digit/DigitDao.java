package com.kotenko.french.lesson.digit;

import com.kotenko.french.lesson.Data;
import com.kotenko.french.lesson.IDataDao;

import java.util.List;

public class DigitDao implements IDataDao<Integer> {
    private final List<Data<Integer>> data = List.of(
            new Data<>(0, "zéro"),
            new Data<>(1, "un"),
            new Data<>(2, "deux"),
            new Data<>(3, "trois"),
            new Data<>(4, "quatre"),
            new Data<>(5, "cinq"),
            new Data<>(6, "six"),
            new Data<>(7, "sept"),
            new Data<>(8, "huit"),
            new Data<>(9, "neuf"));
    @Override
    public List<Data<Integer>> getData() {
        return this.data;
    }
}
