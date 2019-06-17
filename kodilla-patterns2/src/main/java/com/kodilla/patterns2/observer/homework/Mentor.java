package com.kodilla.patterns2.observer.homework;

public class Mentor implements MentorObserver{
    private final String mentorName;
    private int taskCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getTaskCount() {
        return taskCount;
    }

    @Override
    public void update(Queue queue) {
        System.out.println(mentorName + ": You got new task from student in " + queue.getName()+ " queue");
        taskCount++;
    }
}
