package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.*;

public final class Forum {

    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(001, "Tomas", 'M', LocalDate.of(1988, 5, 18), 3));
        forumUsers.add(new ForumUser(002, "Janet", 'F', LocalDate.of(2000, 6, 2), 32));
        forumUsers.add(new ForumUser(003, "Alicia", 'F', LocalDate.of(1998, 8, 5), 0));
        forumUsers.add(new ForumUser(004, "Jay", 'M', LocalDate.of(1965, 12, 13), 23));
        forumUsers.add(new ForumUser(005, "Bert", 'M', LocalDate.of(2001, 11, 17), 0));
        forumUsers.add(new ForumUser(006, "John", 'M', LocalDate.of(1978, 10, 23), 1));
        forumUsers.add(new ForumUser(007, "Matt", 'M', LocalDate.of(1972, 1, 24), 1234));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }
}
