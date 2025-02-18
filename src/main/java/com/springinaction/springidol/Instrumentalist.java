package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


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


    @Autowired(required = false)

//    Чтобы гарантировать, что Spring выберет пианино для компонента kenny, даже если существуют другие компоненты,
//    которые могут быть связаны с его свойством instrument, можно добавить аннотацию @Qualifier, ссылающуюся на компонент
//    с именем piano:
    @Qualifier("piano")
    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument; // инструмент
    }




}
