package com.mycompany.tasks_sipi.models;

/**
 *Класс, описывающий пользователя
 * @author Anastasia Lidjigoryaeva "anastasia.lijigoryaeva@mail.ru"
 * @version 1.0
 */
public class User {
    /** Поле идентификатор */
    private int id;
    /** Поле имени */
    private String first_name;
    /** Поле фамилии */
    private String last_name;
    /** Поле логина */
    private String login;
    /** Поле телефона */
    private String phone;

    /** Метод для инициализации пользователя
     * @param login логин
     */
    public User(String login){
        this.first_name ="Ana";
        this.last_name ="Li";
        this.login=login;
    }
    /** Метод для получения идентификатора пользователя
     * @return Идентификатор пользователя
     */
    public int getId() {
        return id;
    }
    /** Метод для получения имени пользователя
     * @return Имя пользователя
     */
    public String getFirst_name() {
        return first_name;
    }
    /** Метод для получения фамилии пользователя
     * @return Фамилия пользователя
     */
    public String getLast_name() {
        return last_name;
    }
    /** Метод для получения логина пользователя
     * @return Логин пользователя
     */
    public String getLogin() {
        return login;
    }
    /** Метод для получения телефона пользователя
     * @return Телефон пользователя
     */
    public String getPhone() {
        return phone;
    }
    /** Метод для установки идентификатора
     * @param id новый идентификатор пользователя
     */
    public void setId(int id) {
        this.id = id;
    }
    /** Метод для установки имени
     * @param first_name новое имя пользователя
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    /** Метод для установки фамилии
     * @param last_name новая фамилия пользователя
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    /** Метод для установки логина
     * @param login новый логин пользователя
     */
    public void setLogin(String login) {
        this.login = login;
    }
    /** Метод для установки телефона
     * @param phone новый телефон пользователя
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
