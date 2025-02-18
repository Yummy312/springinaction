package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.beans.factory.annotation.Value;


public class Instrumentalist implements Performer {

    public Instrumentalist() {
    }
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
    private String song;

//    Помимо внедрения ссылок на компоненты с помощью аннотаций автоматического связывания,
//    может появиться желание использовать аннотации для внедрения простых значений. В версии Spring
//    3.0 появилась новая аннотация @Value , позволяющая внедрять простые значения таких типов,
//    как int, boolean и String. Например:
    @Value("Jingle Bells")  // Здесь в строковое свойство внедряется обычное строковое значение
    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }
//    Аннотация @Value проста в использовании. Ее применение заключается в том, чтобы добавить аннотацию
//    @Value перед свойством, методом или параметром метода и передать ей строку с выражением,
//    результат которого должен быть внедрен.


    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }
    private Instrument instrument;


//    Внедрение простых значений не является коньком аннотации @Value. Полная ее мощь заключается в возможности
//    использовать выражения на языке SpEL. Это делает аннотацию @Value мощным инструментом внедрения. Например:

    @Value("#{saxophone}") // Внедрение компонента по его идентификатору saxophone, который определен в XML-конфигурации
    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument; // инструмент
    }



}
