package com.springinaction.springidol;

public class Auditorium {

    public void turnOnLight(){
        System.out.println("Этот метод вызывается после создания экземпляра этого компонента (класс Auditorium)");
    }
    public void turnOffLight(){
        System.out.println("Этот метод вызывается перед уничтожением экземпляра этого компонента (класс Auditorium)");

    }

}
