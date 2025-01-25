package com.springinaction.springidol;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SongSelector {

    // Коллекция песен в виде строк (названия песен)
    private final List<String> songs = Arrays.asList(
            "'Jingle Bells'",
            "'Merry Christmas'",
            "'Happy New Year'"
    );

    // Метод для случайного выбора названия песни
    public String selectSong(){
        Random random= new Random();
        return songs.get(random.nextInt(songs.size()));
    }
}
