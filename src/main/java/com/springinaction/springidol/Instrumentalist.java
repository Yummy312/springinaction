package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.beans.factory.annotation.Configurable;


@Configurable("pianist")
public class Instrumentalist implements Performer {

    public Instrumentalist() {
    }
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
    private String song;
    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }
    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }
    private Instrument instrument;
    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument; // инструмент
    }

}

// Аннотация @Configurable играет двоякую роль:
//   1) во-первых, она показывает, что экземпляр класса Instrumentalist
//      может быть сконфигурирован фреймворком Spring, даже при создании за его пределами;
//   2) она также связывает класс Instrumentalist и компонент с идентификатором pianist.
//      При настройке экземпляра класса Instrumentalist фреймворк Spring будет использовать определение
//      компонента pianist как шаблон.

// Но как Spring узнает, как настраивать компоненты с аннотацией
// @Configurable? За это отвечает следующий элемент в конфигурации Spring:
// <aop:spring-configured />