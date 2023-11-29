package com.kotenko.french.lesson.digit;

import com.kotenko.french.lesson.Data;
import com.kotenko.french.lesson.IDataDao;

import java.util.List;

public class DigitService<T> {
    private final IDataDao<T> dao;

    public DigitService(IDataDao<T> dao) {
        this.dao = dao;
    }

    public List<Data<T>> getData() {
        return dao.getData();
    }
}
