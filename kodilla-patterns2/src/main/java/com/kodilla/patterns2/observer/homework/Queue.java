package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Queue implements KodillaObservable {
    private final List<MentorObserver> mentorObservers;
    private final List<String> tasksInQueue;
    private final String name;

    public Queue(String name) {
        mentorObservers = new ArrayList<>();
        tasksInQueue = new ArrayList<>();
        this.name = name;
    }

    public List<MentorObserver> getMentorObservers() {
        return mentorObservers;
    }

    public List<String> getTasksInQueue() {
        return tasksInQueue;
    }

    public String getName() {
        return name;
    }

    public void addTaskToQueue(String post) {
        tasksInQueue.add(post);
        notifyMentors();
    }

    @Override
    public void registerMentor(MentorObserver mentorObserver) {
        mentorObservers.add(mentorObserver);
    }

    @Override
    public void notifyMentors() {
        for (MentorObserver mentorObserver : mentorObservers) {
            mentorObserver.update(this);
        }
    }

    @Override
    public void removeMentor(MentorObserver mentorObserver) {
        mentorObservers.remove(mentorObserver);
    }
}
