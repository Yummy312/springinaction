package com.springinaction.springidol;

import org.springframework.stereotype.Component;

//Когда фреймворк будет просматривать пакет com.springinaction.springidol, он обнаружит, что класс Saxophone
//отмечен аннотацией @Component, и автоматически зарегистрирует его как компонент. По умолчанию
//идентификатор компонента генерируется из имени класса, где первый символ имени замещается этим же символом
//в нижнем регистре. В случае с классом Saxophone компонент получит идентификатор saxophone.
@Component
public class Saxophone implements Instrument {
    public Saxophone() {
    }
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}