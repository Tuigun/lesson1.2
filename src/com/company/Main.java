package com.company;

public class Main {

    public static void main(String[] args) {
        int temperature = 20;
        int numberOfStudent = 16;
        boolean isItRainy = true;

        if (temperature > 25) {
            int number = 9;
            System.out.println(number / 3);
            System.out.println("На улице жарко");
        }

        if (isItRainy) {
            System.out.println("Возьмите зонт");
        }

        if (numberOfStudent > 10) {
            System.out.println("Играем в футбол");
        } else {
            System.out.println("Идем в кино");
        }

        if (temperature < 0) {
            System.out.println("Сидите дома");
        } else {
            System.out.println("Хорошей прогулки");
        }

        if (numberOfStudent < 5) {
            System.out.println("Едем на такси");
        } else if (numberOfStudent <= 16) {
            System.out.println("Едем на бусе");
        } else {
            System.out.println("Едем автобусе");
        }
        // temp = 20
        //temperature = 32;
        if (temperature > 30) {
            System.out.println("Очень жарко");
            if (numberOfStudent == 16) {
                System.out.println("Нас шестнадцать");
            } else {
                System.out.println("Нас не шестнадцать");
            }
        }

        /*else {
            System.out.println();
        } без if блок else быть не может */
        System.out.println("End of program");
    }
}
