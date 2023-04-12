package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LimitOverpassedException extends Exception{
    String dateTime;

    public LimitOverpassedException(String msg){
        super(msg);
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
}
