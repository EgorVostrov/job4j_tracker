package ru.job4j.oop;

public class Cat {

    private String name;

    public void show() {
        System.out.println(this.name);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("Имя котика");
        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.show();
        System.out.println("Котик кушал");
        Cat black = new Cat();
        black.giveNick("Котлету");
        black.show();
    }
}