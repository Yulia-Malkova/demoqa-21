package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

import static com.demoqa.utils.Variables.userBirthdayMonth;

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
        String [] gender = {"Male", "Female", "Other"};
        return new Faker().options().option(gender);
    }
    public static String getUserNumber() {
        return faker.numerify("##########");
    }
    public static String getBirthYear() {
        return new Faker().random().nextInt(1943, 2005).toString();
    }
    public static String getBirthMonth() {
        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October","November", "December"};
        return new Faker().options().option(month);
    }
    public static String getBirthDay() {
        Random rnd = new Random();
        int day;
        switch (userBirthdayMonth) {
            case "January","March", "May", "July", "August", "October", "December": day = rnd.nextInt(1,31);
                break;
            case "February": day = rnd.nextInt(1,28);
                break;
            case"April", "June","September", "November" :  day = rnd.nextInt(1,30);
                break;
            default : day = 1;}
        if (day < 10) {
            return "0" + day;
        } else {
            return Integer.toString(day);
        }
    }
    public static String getUserSubject() {
        String [] subject = {"English", "Chemistry","Computer Science", "Commerce", "Economics", "Social Studies",
                            "Arts", "History","Maths", "Accounting", "Physics", "Biology", "Hindi", "Civivs"};
        return new Faker().options().option(subject);
    }
    public static String getUserHobby() {
        String [] hobby = {"Sports", "Reading", "Music"};
        return new Faker().options().option(hobby);
    }
    public static String getUserAddress() {
        return faker.address().fullAddress();
    }
    public static String getUserState() {
        String [] userState = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return new Faker().options().option(userState);
    }
    public static String getUserCity(String state) {
        switch (state) {
            case "NCR": {
                String [] ncrCity = {"Delhi", "Gurgaon", "Noida"};
                return new Faker().options().option(ncrCity);
            }
            case "Uttar Pradesh": {
                String [] uttarPradeshCity = {"Agra", "Lucknow", "Merrut"};
                return new Faker().options().option(uttarPradeshCity);
            }
            case "Haryana": {
                String [] haryanaCity = {"Karnal", "Panipat"};
                return new Faker().options().option(haryanaCity);
                }
            case "Rajasthan": {
                String [] rajasthanCity = {"Jaipur", "Jaiselmer"};
                return new Faker().options().option(rajasthanCity);
            }
        }
        return null;

    }
}