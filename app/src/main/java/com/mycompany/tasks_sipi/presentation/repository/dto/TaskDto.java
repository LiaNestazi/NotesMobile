package com.mycompany.tasks_sipi.presentation.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.mycompany.tasks_sipi.models.Task;
import com.mycompany.tasks_sipi.models.User;
import com.mycompany.tasks_sipi.presentation.converters.DateConverter;
import com.mycompany.tasks_sipi.presentation.converters.UserConverter;

import java.util.Date;

/**
 *Класс, описывающий сущность таблицы базы данных - задача
 * @author Anastasia Lidjigoryaeva "anastasia.lijigoryaeva@mail.ru"
 * @version 1.0
 */
@Entity(tableName = "tasks")
public class TaskDto implements Parcelable {
    /** Поле идентификатор */
    @PrimaryKey(autoGenerate = true)
    private int id;
    /** Поле название задачи */
    @ColumnInfo
    private String name;
    /** Поле описание задачи */
    @ColumnInfo
    private String desc;
    /** Поле дата создания задачи */
    @ColumnInfo
    @TypeConverters(DateConverter.class)
    private Date date;
    /** Поле автор задачи */
    @ColumnInfo
    @TypeConverters(UserConverter.class)
    private User creator;
    /** Поле состояние задачи */
    @ColumnInfo
    private boolean done;
    /** Поле почта автора задачи */
    @ColumnInfo
    private String creator_email;
    /** Метод для инициализации пустого объекта */
    public TaskDto(){

    }
    /** Метод для инициализации объекта
     * @param in контейнер для передачи данных
     */
    protected TaskDto(Parcel in) {
        id = in.readInt();
        name = in.readString();
        desc = in.readString();
        done = in.readByte() != 0;
    }
    /** Инициализация автора задачи */
    public static final Parcelable.Creator<TaskDto> CREATOR = new Parcelable.Creator<TaskDto>() {
        @Override
        public TaskDto createFromParcel(Parcel in) {
            return new TaskDto(in);
        }

        @Override
        public TaskDto[] newArray(int size) {
            return new TaskDto[size];
        }
    };
    /** Метод для получения идентификатора
     * @return Идентификатор задачи
     */
    public int getId() {
        return id;
    }
    /** Метод для получения названия
     * @return Название задачи
     */
    public String getName() {
        return name;
    }
    /** Метод для получения описания
     * @return Описание задачи
     */
    public String getDesc() {
        return desc;
    }
    /** Метод для получения даты создания
     * @return Дата создания задачи
     */
    public Date getDate() {
        return date;
    }
    /** Метод для получения автора
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
    /** Метод для получения почты автора
     * @return Почта автора задачи
     */
    public String getCreator_email() {
        return creator_email;
    }
    /** Метод для установки идентификатора
     * @param id идентификатор задачи
     */
    public void setId(int id) {
        this.id = id;
    }
    /** Метод для установки названия
     * @param name название задачи
     */
    public void setName(String name) {
        this.name = name;
    }
    /** Метод для установки описания
     * @param desc описание задачи
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    /** Метод для установки даты создания
     * @param date дата создания задачи
     */
    public void setDate(Date date) {
        this.date = date;
    }
    /** Метод для установки автора
     * @param creator автор задачи
     */
    public void setCreator(User creator) {
        this.creator = creator;
    }
    /** Метод для установки состояния задачи
     * @param done состояние задачи
     */
    public void setDone(boolean done) {
        this.done = done;
    }
    /** Метод для установки почты автора
     * @param creator_email почта автора задачи
     */
    public void setCreator_email(String creator_email) {
        this.creator_email = creator_email;
    }
    /** Метод для конвертации из класса Task
     * @param task объект класса Task
     * @return Объект класса TaskDto
     */
    public TaskDto convertFromTask(Task task) {
        TaskDto dto = new TaskDto();

        dto.setId(task.getId());
        dto.setName(task.getName());
        dto.setDesc(task.getDesc());
        dto.setCreator(task.getCreator());
        dto.setDate(task.getDate());
        dto.setCreator_email(task.getCreatorEmail());

        return dto;
    }

    /** Метод описания содержимого (не используется)
     * @return 0
     */
    @Override
    public int describeContents() {
        return 0;
    }
    /** Метод для записи информации в объект класса Parcel
     * @param dest объект класса Parcel, в который будет записана информация
     * @param flags количество установленных флагов
     * @return Объект класса TaskDto
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[] {String.valueOf(id), name, desc, date.toString(), creator.getLogin(), String.valueOf(done)});

    }
}
