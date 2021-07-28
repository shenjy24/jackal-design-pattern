package com.jonas.behavioral.memento;

public class Client {

    public static void main(String[] args) {
        Originator or = new Originator();
        or.setState("S0");
        System.out.println("初始状态:" + or.getState());

        Caretaker cr = new Caretaker();
        cr.setMemento(or.createMemento()); //保存状态

        or.setState("S1");
        System.out.println("新的状态:" + or.getState());

        or.restoreMemento(cr.getMemento()); //恢复状态
        System.out.println("恢复状态:" + or.getState());
    }
}
