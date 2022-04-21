package com.mycompany.tasks_sipi.models;

import com.mycompany.tasks_sipi.presentation.repository.dto.TaskDto;

import java.util.Date;

/**
 *Класс, описывающий задачу
 * @author Anastasia Lidjigoryaeva "anastasia.lijigoryaeva@mail.ru"
 * @version 1.0
 */
public class Task {
    /** Поле идентификатор */
    private int id;
    /** Поле название задачи */
    private String name;
    /** Поле описание задачи */
    private String desc;
    /** Поле дата создания */
    private Date date;
    /** Поле автор задачи */
    private User creator;
    /** Поле состояние задачи */
    private boolean done;
    /** Поле почта автора */
    private String creatorEmail;

    /** Метод для получения идентификатора задачи
     * @return Идентификатор задачи
     */
    public int getId() {
        return id;
    }
    /** Метод для получения названия задачи
     * @return Название задачи
     */
    public String getName() {
        return name;
    }
    /** Метод для получения описания задачи
     * @return Описание задачи
     */
    public String getDesc() {
        return desc;
    }
    /** Метод для получения даты создания задачи
     * @return Дата создания задачи
     */
    public Date getDate() {
        return date;
    }
    /** Метод для получения автора задачи
     * @return Автор задачи
     */
    public User getCreator() {
        return creator;
    }
    /** Метод для получения состояния задачи
     * @return Состояние задачи
     */
    public boolean isDone() {
        return done;
    }
    /** Метод для получения почты автора задачи
     * @return Почта автора задачи
     */
    public String getCreatorEmail() {
        return creatorEmail;
    }
    /** Метод для установки идентификатора задачи
     * @param id идентификатор задачи
     */
    public void setId(int id) {
        this.id = id;
    }
    /** Метод для установки названия задачи
     * @param name название задачи
     */
    public void setName(String name) {
        this.name = name;
    }
    /** Метод для установки описания задачи
     * @param desc описание задачи
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    /** Метод для установки даты создания задачи
     * @param date дата создания задачи
     */
    public void setDate(Date date) {
        this.date = date;
    }
    /** Метод для установки автора задачи
     * @param creator автор задачи
     */
    public void setCreator(User creator) {
        this.creator = creator;
    }
    /** Метод для установки состояния задачи
     * @param done название задачи
     */
    public void setDone(boolean done) {
        this.done = done;
    }
    /** Метод для установки почты автора задачи
     * @param creatorEmail почта автора задачи
     */
    public void setCreatorEmail(String creatorEmail) {
        this.creatorEmail = creatorEmail;
    }
    /** Метод для конвертации из DTO
     * @param taskDto объект задачи в формате DTO
     * @return Объект класса Task - задача
     */
    public Task convertFromDto(TaskDto taskDto){
        Task temp = new Task();
        temp.setId(taskDto.getId());
        temp.setName(taskDto.getName());
        temp.setDesc(taskDto.getDesc());
        temp.setDate(taskDto.getDate());
        temp.setCreator(taskDto.getCreator());
        temp.setDone(taskDto.isDone());
        temp.setCreatorEmail(taskDto.getCreator_email());

        return temp;
    }
}
