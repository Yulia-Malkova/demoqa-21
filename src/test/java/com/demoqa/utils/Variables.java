package com.demoqa.utils;

import static com.demoqa.utils.RandomGeneration.*;

public class Variables {
    public static String
            firstName = getFirstName(),
            lastName = getLastName(),
            userEmail =getUserEmail(),
            userGender = getUserGender(),
            userBirthdayYear = getBirthYear(),
            userBirthdayMonth = getBirthMonth(),
            userBirthDay = getBirthDay(),
            userNumber = getUserNumber(),
            userSubject = getUserSubject(),
            userHobby = getUserHobby(),
            userAddress = getUserAddress(),
            userState = getUserState(),
            userCity = getUserCity(userState),
            userFullName = firstName+" "+lastName,
            userFullBirthday = userBirthDay+" "+userBirthdayMonth+","+userBirthdayYear,
            userStateCity = userState+" "+userCity;








}
