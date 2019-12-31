package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("messageRandomService")
public class RandomTextMessageService implements MessageService{
    List<String> messages = new ArrayList<>(Arrays.asList(
            "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "sed", "do"
    ));
    Random random = new Random();
    @Override
    public String getMessage() {
        return messages.get(random.nextInt(10));
    }
}
