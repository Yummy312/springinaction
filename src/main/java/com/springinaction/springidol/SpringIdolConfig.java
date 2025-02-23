package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringIdolConfig {

    @Bean
    public Instrument saxophone(){
        return new Saxophone();
    }

//    Как видите, внедрение через метод записи на языке Java выглядит вполне естественно:
    @Bean
    public Performer kenny(){
        Instrumentalist kenny = new Instrumentalist();
        kenny.setInstrument(saxophone());

//      Внедрение простых значений реализуется очень просто
        kenny.setSong("Jingle Bells");
        return kenny;
    };

//    А как обстоит дело со ссылками на другие компоненты?
//    Все так же просто.
//    Для иллюстрации сначала объявим компонент sonnet29
    @Bean
    public Poem sonnet29(){
        return new Sonnet29();
    }

//    Теперь создадим компонент типа PoeticJuggler и внедрим в него компонент sonnet29 через конструктор:
    @Bean
    public Performer poeticDuke(){
        return new PoeticJuggler(sonnet29());
    }
//    Внедрение другого компонента заключается в использовании ссылки на метод определения внедряемого компонента.
//    Но эта простота кажущаяся. В действительности все немного сложнее.

//    В конфигурации Spring на языке Java ссылка на компонент через метод с его объявлением – это не то же самое,
//    что вызов метода. Если бы это было так, то всякий раз, вызывая метод sonnet29(), мы получали бы новый экземпляр
//    компонента. Фреймворк Spring действует немного тоньше.
//
//    Пометив метод sonnet29() аннотацией @Bean, мы сообщаем фреймворку, что этот метод определяет компонент
//    для регистрации в контексте приложения. Поэтому при каждом обращении к этому методу внутри другого метода
//    объявления компонента Spring будет перехватывать вызов метода и пытаться отыскать компонент в контексте
//    приложения, не позволяя этому методу создать новый экземпляр.


}

