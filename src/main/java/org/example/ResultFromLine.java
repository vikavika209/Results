package org.example;

import java.time.Duration;
import java.util.List;

public class ResultList {
    public List<Result> getListResits (String line){
        List<Result> res = new
        String[] splitLines = line.split(",");
        var name = splitLines[0];
        var gender = Gender.valueOf(splitLines[1]);
        var distance = Distance.valueOf(splitLines[2]);
        var time = getDurationFromLine(splitLines[3]);
        Person person = new Person(name, gender);
        Result result = new Result(person, distance, time);

    }

    public Duration getDurationFromLine(String line){
        var splitLines = line.split(":");
        var totalSeconds = Integer.parseInt(splitLines[0]) * 60 + Integer.parseInt(splitLines[1]);
        return Duration.ofSeconds(totalSeconds);
    }
}
