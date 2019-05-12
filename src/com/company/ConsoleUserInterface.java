package com.company;

import java.util.Map;

public class ConsoleUserInterface {

    private String fileName;
    private Map<String, Number> telephoneBook;

    public ConsoleUserInterface(String fileName) {
        this.fileName = fileName;
        //TODO implement telephone book
    }

    public void startInterface(){

        //TODO read from Console
        String userCommand = "name";

        while (!"Exit".equals(userCommand)){
            Number resoult = telephoneBook.get(userCommand);
            System.out.println("found" + resoult);
            ///TODO read userCommand again
        }
        System.out.println("Выходим");
    }

}
