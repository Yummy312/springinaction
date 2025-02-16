package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.beans.factory.annotation.Autowired;


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

//    Предположим, что необходимо с помощью аннотации @Autowired
//    обеспечить автоматическое внедрение значения в свойство instrument
//    компонента Instrumentalist. Для этого можно аннотировать метод
//    setInstrument(), как показано ниже:
    @Autowired
    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument; // инструмент
    }


//    Самая интересная особенность аннотации @Autowired состоит в
//    том, что ее необязательно применять к методу записи. Эту аннотацию можно применить к любому методу.

//    Также аннотацию @Autowired можно даже применить к конструктору.

}
