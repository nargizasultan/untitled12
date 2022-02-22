package com.company;

import java.util.Random;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowewAlphabet = "abcdefghijklmnoprstuvwxyz";
        alphabet.equalsIgnoreCase(lowewAlphabet);
        String text = "HI";


        StringBuilder sb = new StringBuilder();



        Random random = new Random();


        for (int i = 0; i<100; i++) {


            int index = random.nextInt(alphabet.length());


            char randomChar = alphabet.charAt(index);
            if (randomChar != text.charAt(0)) {
                continue;
            } else {
                sb.append(randomChar);



            }


        }

        String randomString = sb.toString();
        System.out.println(randomString);


    }

}
