package ru.job4j.tracker.oop;

public class Student {

    public void music(String lirics) {
        System.out.println("I can sign a song : " + lirics);
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.music(song);
        petya.music(song);
        petya.music(song);
        petya.song();
        petya.song();
        petya.song();
    }
}