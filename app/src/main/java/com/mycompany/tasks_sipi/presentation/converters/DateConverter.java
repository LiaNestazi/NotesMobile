package com.mycompany.tasks_sipi.presentation.converters;

import androidx.room.TypeConverter;

import java.util.Date;

/**
 *Класс, описывающий конвертер даты
 * @author Anastasia Lidjigoryaeva "anastasia.lijigoryaeva@mail.ru"
 * @version 1.0
 */
public class DateConverter {
    /** Метод для конвертации отметки времени в дату
     * @param timestamp отметка времени
     * @return Дата
     */
    @TypeConverter
    public static Date toDate(Long timestamp) {
        return timestamp == null ? null : new Date(timestamp);
    }
    /** Метод для конвертации даты в отметку времени
     * @param date дата
     * @return Отметка времени
     */
    @TypeConverter
    public static Long toTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}
