package com.springinaction.springidol;
import org.springframework.beans.factory.support.MethodReplacer;
import java.lang.reflect.Method;

//            ___Реализация класса замещения метода___

// Класс TigerReplacer реализует интерфейс MethodReplacer, требующий реализации единственного метода
// reimplement(). Этот метод принимает три аргумента: объект, в котором будет производиться замещение метода, метод, подлежащий замещению,
// и массив аргументов, принимаемых методом.
// В нашем случае аргументы отсутствуют, но их можно передать при необходимости.
// Тело метода reimplement() фактически становится новой реализацией метода getContents() интерфейса MagicBox.
// В нашем примере единственное, что требуется, – это вернуть строку «A ferocious tiger» (свирепый тигр).
// Фактически прежнее содержимое ящика заменяется тигром
public class TigerReplacer implements MethodReplacer{

    @Override
    public Object reimplement(Object obj, Method method,
                              Object[] args) throws Throwable { // Подмена
                                                                // Метода


        return "A ferocious tiger"; // Помещает тигра в ящик
    }
}
