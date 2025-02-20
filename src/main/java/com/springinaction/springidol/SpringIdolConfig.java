package com.springinaction.springidol;

import org.springframework.context.annotation.Configuration;

//Когда мы начинали знакомиться с конфигурациями Spring в формате XML, я показал фрагмент с элементом <beans>
//из пространства имен beans, играющим роль корневого элемента. Его эквивалентом на языке Java является класс,
//отмеченный аннотацией @Configuration.
//Например:
@Configuration
public class SpringIdolConfig {

    // Здесь находятся методы, определяющие компоненты
}

//Аннотация @Configuration подсказывает фреймворку Spring, что данный класс содержит одно или более
//определений компонентов. Объявления компонентов – это обычные методы, отмеченные аннотацией @Bean.