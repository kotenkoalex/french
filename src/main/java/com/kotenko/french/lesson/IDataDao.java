package com.kotenko.french.lesson;

import java.util.List;

public interface IDataDao<T> {
    List<Data<T>> getData();
}
