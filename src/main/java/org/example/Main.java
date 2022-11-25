package org.example;

import org.example.google.googleParser;
import org.example.google.googleSettings;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String imageTopic = "meme with doge";
        worker<ArrayList<String>> parser = new worker<>(new googleParser());
        parser.setParserSettings(new googleSettings(30));
        parser.startParse(imageTopic);
    }

    static class NewData implements IOnNewDataHandler<ArrayList<String>> {

        @Override
        public void OnNewData(Object sender, ArrayList<String> args) {
            System.out.printf("pic");
        }
    }
}