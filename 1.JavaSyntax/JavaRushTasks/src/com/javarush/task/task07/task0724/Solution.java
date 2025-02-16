package com.javarush.task.task07.task0724;

public class Solution {
    public static void main(String[] args) {
        Human grandFather1 = new Human("Дедушка1", false, 71);
        Human grandFather2 = new Human("Дедушка2", false, 72);
        Human grandMother1 = new Human("Бабушка1", true, 71);
        Human grandMother2 = new Human("Бабушка2", true, 72);
        Human father = new Human("Отец", false, 45, grandFather2, grandMother2);
        Human mother = new Human("Мать", true, 40, grandFather1, grandMother1);
        Human child1 = new Human("Сын1", false, 20, father, mother);
        Human child2 = new Human("Сын2", false, 20, father, mother);
        Human child3 = new Human("Дочь1", true, 18, father, mother);
        Human child4 = new Human("Дочь2", true, 19, father, mother);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(child4);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }

    }

}
