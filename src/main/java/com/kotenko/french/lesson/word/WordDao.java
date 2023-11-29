package com.kotenko.french.lesson.word;

import com.kotenko.french.lesson.Data;
import com.kotenko.french.lesson.IDataDao;

import java.util.List;

public class WordDao implements IDataDao<String> {
    private final List<Data<String>> data = List.of(
            new Data<>("red", "rouge"),
            new Data<>("blue", "bleu"),
            new Data<>("green", "vert"),
            new Data<>("yellow", "jaune"),
            new Data<>("orange", "orange"),
            new Data<>("violet", "violet"),
            new Data<>("pink", "rose"),
            new Data<>("brown", "marron"),
            new Data<>("gray", "gris"),
            new Data<>("white", "blanc"));

    @Override
    public List<Data<String>> getData() {
        return this.data;
    }
}
