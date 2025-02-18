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



//    Определим необязательное автоматическое связывание, установив атрибут required аннотации
//    @Autowired в значение false. В этом случае Spring попытается связать свойство instrument,
//    но если он не найдет подходящего компонента типа Instrument, ничего страшного не произойдет.
//    Свойство просто получит значение null
    @Autowired(required = false)
    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument; // инструмент
    }




}
