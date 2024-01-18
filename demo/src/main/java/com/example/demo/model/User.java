package com.example.demo.model;

import java.util.Objects;

/**
 * Сущность пользователя.
 */
public class User {
    /**
     * Уникальный идентификатор.
     */
    private int id;
    /**
     * Имя пользователя.
     */
    private String firstName;
    /**
     * Фамилия пользователя.
     */
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * equals - переопределенный метод для сравнения объектов User.
     *
     * @param o - Объект сравнения.
     * @return - true, если объекты равны, иначе - false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(firstName, user.getFirstName()) && Objects.equals(lastName, user.getLastName());
    }

    /**
     * hashCode - переопределенный метод hashCode для генерации хэш-кода объекта User.
     *
     * @return - Хэш-код объекта User.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }
}