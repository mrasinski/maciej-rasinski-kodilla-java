package com.kodilla.stream.forumuser;

import java.time.*;

public final class ForumUser {

    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int numberOfPosts;

    public ForumUser(int userID, String username, char sex, LocalDate birthdayDate, int numberOfPosts) {
        this.userID = userID;
        this.username = username;
        if(sex == 'F') {
            this.sex = sex;
        } else {
            this.sex = 'M';
        }
        this.birthdayDate = birthdayDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
