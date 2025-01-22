package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;
import java.util.Collection;

//Как и Кенни, Хэнк способен играть на нескольких инструментах, но Хэнк
//может играть на нескольких инструментах одновременно. Хэнк
//определен классом OneManBand , как показано в листинге



//Исполнитель, который является человеком-оркестром
public class OneManBand implements Performer{

    private  Collection<Instrument> instruments;


    public void perform() throws PerformanceException {
        for(Instrument instrument: instruments){
            instrument.play();
        }

    }

//    Наиболее важно здесь, что коллекция инструментов внедряется через
//    метод setInstruments()
    public void setInstruments(Collection<Instrument> instruments){
        this.instruments = instruments; // Внедрение коллекции инструментов
    }
}
