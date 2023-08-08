package com.demoqa.utils;

import com.demoqa.data.*;
import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;


public class RandomGeneration {
    private static Faker faker = new Faker(new Locale("en"));
    public static String getFirstName() {
        return faker.name().firstName();
    }
    public static String getLastName() {
        return faker.name().lastName();
    }
    public static String getUserEmail() {
        return faker.internet().emailAddress();
    }
    public static String getUserGender() {
        return Gender.values()[new Random().nextInt(Gender.values().length)].getTitle();
    }
    public static String getUserNumber() {
        return faker.numerify("##########");
    }
    public static String getBirthYear() {
        return new Faker().random().nextInt(1943, 2005).toString();
    }
    public static String getBirthMonth() {
        return Month.values()[new Random().nextInt(Month.values().length)].getTitle();
    }
    public static String getBirthDay() {
        Random rnd = new Random();
        int day = rnd.nextInt(1,28);
        if (day < 10) {
            return "0" + day;
        } else {
            return Integer.toString(day);
        }
    }
    public static String getUserSubject() {
        return Subject.values()[new Random().nextInt(Subject.values().length)].getTitle();
    }
    public static String getUserHobby() {
        return Hobby.values()[new Random().nextInt(Hobby.values().length)].getTitle();
    }
    public static String getUserAddress() {
        return faker.address().fullAddress();
    }
    public static String getUserState() {
        String userState = State.values()[new Random().nextInt(State.values().length)].getTitle();
        return userState;
    }
    public static String getUserCity(String state) {
        switch (state) {
            case "NCR": {
                return NCRCity.values()[new Random().nextInt(NCRCity.values().length)].getTitle();
            }
            case "Uttar Pradesh": {
                return UttarPradeshCity.values()[new Random().nextInt(UttarPradeshCity.values().length)].getTitle();
            }
            case "Haryana": {
                return HaryanaCity.values()[new Random().nextInt(HaryanaCity.values().length)].getTitle();
            }
            case "Rajasthan": {
                return RajasthanCity.values()[new Random().nextInt(RajasthanCity.values().length)].getTitle();
            }
        }
        return null;

    }
}