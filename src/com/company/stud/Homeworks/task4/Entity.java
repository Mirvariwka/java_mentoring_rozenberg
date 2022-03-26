package com.company.stud.Homeworks.task4;
/*Создать класс с одним полем [например, class Entity {private String name;
// конструктор, геттер, сеттер, toString} ]
Записать в список ArrayList 5 экземпляров этого класса.
Создать метод, который принимает String как параметр и возвращает из списка объект Entity,
у которого поле name совпадает с переданным параметром.
Например, public static Entity getByName(String name) {//реализация}*/


    public class Entity {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Entity(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Entity{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }
