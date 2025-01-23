package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;
import java.util.Map;

//Преобразование коллекции инструментов класса OneManBand в отображение (Map)
public class OneManBand implements Performer{

    private  Map<String, Instrument> instruments;


    public void perform() throws PerformanceException {
        for(String key: instruments.keySet()){
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }

    }


    public void setInstruments(Map<String, Instrument> instruments){
        this.instruments = instruments; // Внедрение инструментов в виде
    }                                   // отображения (Map)
}
