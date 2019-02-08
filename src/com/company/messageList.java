package com.company;
import java.util.*;
import java.time.*;

public class messageList {

    private String nameOfFriend;
    private String nameOfYou;
    public ArrayList arrList;

    public messageList(String yourName, String contactName){
        this.nameOfFriend = contactName;
        this.nameOfYou = yourName;
        arrList = new ArrayList();
    }

    public void addMessage(String mes, int num){

        String message = mes;
        String mesName = " ";
        if(num == 1) {
            mesName = nameOfYou;
        }
        else {
            mesName = nameOfFriend;
        }

        LocalDateTime est = LocalDateTime.now();
        String date = est.toString().substring(0, 10);
        String time = est.toString().substring(11, 19);
        String logMes = date + ", " + time + ": " +  mesName + "- " + message;

        arrList.add(0, logMes);
        System.out.println(logMes);
    }

    public void removeMessage(String message, messageList mL){
        messageList mesList = mL;
        String mes = message;
        mesList.arrList.remove(mes);
    }




}
