package com.company;

public class Kata {
    public static String howMuchILoveYou(int p) {
        switch (p) {
            case 1:
                return "I love you";
            case 2:
                return "a little";
            case 3:
                return "a lot";
            case 4:
                return "passionetly";
            case 5:
                return "madly";
            case 6:
                return "not at all";
        }
        return howMuchILoveYou(p);
    }
}