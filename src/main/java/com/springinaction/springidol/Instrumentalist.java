package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



//В данном случае желаемый идентификатор компонента был передан аннотации @Component в виде параметра.
//По умолчанию компонент получил бы идентификатор instrumentalist, но, чтобы сохранить непротиворечивость
//с предыдущими примерами, для него явно был определен идентификатор eddie
@Component("eddie")
public class Instrumentalist implements Performer {

    public Instrumentalist() {
    }
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
    private String song;


    @Value("Jingle Bells")
    public void setSong(String song) {
        this.song = song;
    }



    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }
    private Instrument instrument;

    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }



}
