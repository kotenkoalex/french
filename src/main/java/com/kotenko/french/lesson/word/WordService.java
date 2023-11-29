package com.kotenko.french.lesson.word;

import com.kotenko.french.lesson.Data;
import com.kotenko.french.lesson.IDataDao;

import java.util.List;

public class WordService<T> {
    private final IDataDao<T> dao;

    public WordService(IDataDao<T> dao) {
        this.dao = dao;
    }

    public List<Data<T>> getData() {
        return dao.getData();
    }
}
