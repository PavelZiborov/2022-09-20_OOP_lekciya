package org.robot;

import java.util.ArrayList;

public class Robot3 {

    enum State {
        On, Off
    }

    private static int defaultIntex;
    private static ArrayList<String> names;

    static {
        defaultIntex = 1;
        names = new ArrayList<String>();
    }

    /**Уровень робота */
    private int level;

    /**Имя робота */
    private String name;

    private State state;

    /**
     * Создание робота
     * @param name Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    private Robot3(int level, String name) {
        if ((name.isEmpty()
                || Character.isDigit(name.charAt(0)))
                || Robot3.names.indexOf(name) != -1) {
            this.name = String.format("DefaultName_%d", defaultIntex++);
        } else {
            this.name = name;
        }
        Robot3.names.add((this.name));
        this.level = level;
        this.state = State.Off;
    }

    public Robot3(String name) {
        this(1, name);
    }

    public Robot3() {
        this("");
    }



    // Методы вкл/выкл подсистем


    public void power() {
        if (this.state == State.Off) {
            this.powerOn();
            this.state = State.On;
        } else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }

    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    private void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }


    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Robot3{" +
                "level=" + level +
                ", name='" + name + '\'' +
                '}';
    }

    /** Загрузка BIOS */
    private void startBIOS() { System.out.println("Start BIOS..."); }

    /** Загрузка OS */
    private void startOS() { System.out.println("Start OS..."); }

    /** Приветствие */
    private void sayHi() { System.out.println("Hello World..."); }

    /** Выгрузка BIOS */
    private void stopBIOS() { System.out.println("Stop BIOS..."); }

    /** Выгрузка OS */
    private void stopOS() { System.out.println("Stop OS..."); }

    /** Прощание */
    private void sayBye() { System.out.println("Bye..."); }

    /** Работа */
    public void work() { System.out.println("Working..."); }
}
