package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;

//Для демонстрации другой формы DI пригласим на сцену нашего
//следующего участника. Кенни (Kenny) – талантливый музыкант,
//как определено классом Instrumentalist

public class Instrumentalist implements Performer {

    public Instrumentalist() {
    }
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
//        instrument.play();
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
