package com.kodilla.patterns2.observer.homework;

public interface KodillaObservable {
    void registerMentor(MentorObserver mentorObserver);
    void notifyMentors();
    void removeMentor(MentorObserver mentorObserver);

}
