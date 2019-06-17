package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTestSuite {
    @Test
    public void testQueue() {
        //Given
        Queue hibernate = new HibernateQueue("Hibernate");
        Queue hibernateContinue = new HibernateQueue("Hibernate continue");
        Queue designPatternsPart1 = new DesignPatternsQueue("Design patterns part 1");
        Queue designPatternsPart2 = new DesignPatternsQueue("Design patterns part 2");
        Queue designPatternsPart3 = new DesignPatternsQueue("Design patterns part 3");
        Mentor andrewSmith = new Mentor("Andrew Smith");
        Mentor jackNovak = new Mentor("Jack Novak");
        hibernate.registerMentor(andrewSmith);
        hibernateContinue.registerMentor(andrewSmith);
        designPatternsPart1.registerMentor(jackNovak);
        designPatternsPart2.registerMentor(jackNovak);
        designPatternsPart3.registerMentor(jackNovak);
        //When
        hibernate.addTaskToQueue("23.1");
        hibernate.addTaskToQueue("23.2");
        hibernateContinue.addTaskToQueue("25.1");
        designPatternsPart1.addTaskToQueue("13.1");
        designPatternsPart2.addTaskToQueue("14.1");
        designPatternsPart2.addTaskToQueue("14.2");
        designPatternsPart3.addTaskToQueue("15.1");
        designPatternsPart3.addTaskToQueue("15.3");
        //Then
        assertEquals(3, andrewSmith.getTaskCount());
        assertEquals(5, jackNovak.getTaskCount());
    }
}
