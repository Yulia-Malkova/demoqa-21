package com.demoqa.utils;

public class Variables {

    RandomGeneration randomGeneration = new RandomGeneration();

    public String
            userFirstName = randomGeneration.getFirstName(),
            userLastName = randomGeneration.getLastName(),
            userEmail =randomGeneration.getUserEmail(),
            userGender = randomGeneration.getUserGender(),
            userBirthDay = randomGeneration.getUserBirthDay(),
            userBirthdayMonth = randomGeneration.getUserBirthMonth(),
            userBirthdayYear = randomGeneration.getUserBirthYear(),
            userNumber = randomGeneration.getUserNumber(),
            userSubject = randomGeneration.getUserSubject(),
            userHobby = randomGeneration.getUserHobby(),
            userAddress = randomGeneration.getUserAddress(),
            userState = randomGeneration.getUserState(),
            userCity = randomGeneration.getUserCity(userState),
            userFullName = userFirstName+" "+userLastName,
            userFullBirthday = userBirthDay+" "+userBirthdayMonth+","+userBirthdayYear,
            userStateCity = userState+" "+userCity;
}