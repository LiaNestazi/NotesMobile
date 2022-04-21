package com.mycompany.tasks_sipi.presentation.converters;

import androidx.room.TypeConverter;

import com.mycompany.tasks_sipi.models.User;

/**
 *Класс, описывающий конвертер пользователя
 * @author Anastasia Lidjigoryaeva "anastasia.lijigoryaeva@mail.ru"
 * @version 1.0
 */
public class UserConverter {
    /** Метод для конвертации логина пользователя в объект класса User
     * @param login логин пользователя
     * @return Объект класса User
     */
    @TypeConverter
    public static User toUser(String login) {
        return login == null ? null : new User(login);
    }
    /** Метод для конвертации объекта класса User в логин пользователя
     * @param user объекта класса User
     * @return Логин пользователя
     */
    @TypeConverter
    public static String toLogin(User user) {
        return user == null ? null : user.getLogin();
    }
}
