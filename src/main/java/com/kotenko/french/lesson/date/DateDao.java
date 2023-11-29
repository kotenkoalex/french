package com.kotenko.french.lesson.date;

import com.kotenko.french.lesson.Data;
import com.kotenko.french.lesson.IDataDao;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class DateDao implements IDataDao<LocalDate> {
    private final List<Data<LocalDate>> data = List.of(
            new Data<>(LocalDate.of(1998, Month.AUGUST, 17), "dix-sept août mille neuf cent quatre-vingt-dix-huit"),
            new Data<>(LocalDate.of(1985, Month.MAY, 22), "vingt-deux mai mille neuf cent quatre-vingt-cinq"),
            new Data<>(LocalDate.of(1973, Month.NOVEMBER, 5), "cinq novembre mille neuf cent soixante-treize"),
            new Data<>(LocalDate.of(2002, Month.MARCH, 1), "quatorze mars deux mille deux"),
            new Data<>(LocalDate.of(1990, Month.SEPTEMBER, 28), "vingt-huit septembre mille neuf cent quatre-vingt-dix"),
            new Data<>(LocalDate.of(1981, Month.JULY, 10), "dix juillet mille neuf cent quatre-vingt-un"),
            new Data<>(LocalDate.of(1977, Month.DECEMBER, 3), "trois décembre mille neuf cent soixante-dix-sept"),
            new Data<>(LocalDate.of(2005, Month.JANUARY, 19), "dix-neuf janvier deux mille cinq"),
            new Data<>(LocalDate.of(1995, Month.JUNE, 26), "vingt-six juin mille neuf cent quatre-vingt-quinze"),
            new Data<>(LocalDate.of(1988, Month.APRIL, 9), "neuf avril mille neuf cent quatre-vingt-huit")
    );

    @Override
    public List<Data<LocalDate>> getData() {
        return this.data;
    }
}
