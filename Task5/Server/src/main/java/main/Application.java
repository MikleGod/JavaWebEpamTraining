package main;

import command.impl.FindSentencesWithSimilarWords;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        System.out.println(new FindSentencesWithSimilarWords().doAction(null).toString());
    }
}
