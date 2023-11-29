package com.kotenko.french.lesson.date;

import com.kotenko.french.lesson.Data;
import com.kotenko.french.lesson.IDataDao;

import java.util.List;

public class DateService<T> {
    private final IDataDao<T> dao;

    public DateService(IDataDao<T> dao) {
        this.dao = dao;
    }

    public List<Data<T>> getData() {
        return dao.getData();
    }
}
