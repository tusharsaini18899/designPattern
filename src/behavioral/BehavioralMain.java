package behavioral;

import behavioral.observer.NewsAgency;
import behavioral.observer.NewsChannel1;
import behavioral.observer.NewsChannel2;
import behavioral.strategy.AddOperation;
import behavioral.strategy.Context;
import behavioral.strategy.MultiplyOperation;
import behavioral.strategy.SubtractOperation;
import behavioral.template.Cricket;
import behavioral.template.Football;
import behavioral.template.Game;

public class BehavioralMain {
    public static void main(String[] args) {

        // Strategy
        // lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
        // when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
        System.out.println("********************  Strategy Start  *************************");
        Context add = new Context(new AddOperation());
        add.executeOperation(5, 4);
        Context sub = new Context(new SubtractOperation());
        sub.executeOperation(5, 4);
        Context multiply = new Context(new MultiplyOperation());
        multiply.executeOperation(5, 4);
        System.out.print("\n\n");

        // iterator -> to traverse the different-different Collections objects


        // observer
        // lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.
        System.out.println("********************  Observer Start  *************************");
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel1 newsChannel1 = new NewsChannel1();
        NewsChannel2 newsChannel2 = new NewsChannel2();
        newsAgency.addObserver(newsChannel1);
        newsAgency.addObserver(newsChannel2);
        newsAgency.setNews("Hello! this is new news 1");
        newsAgency.removeObserver(newsChannel1);
        newsAgency.setNews("Hello! this is new news 2");
        System.out.print("\n\n");

        // Pattern method
        // defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
        // Use the pattern when you have several classes that contain almost identical algorithms with some minor differences. As a result, you might need to modify all classes when the algorithm changes.
        // algo structure fix and written in superclass , depending on the subclass they can implements steps
        System.out.println("********************  Pattern Method Start  *************************");
        Game cricket = new Cricket();
        cricket.play();
        Game football = new Football();
        football.play();
        System.out.print("\n\n");
    }
}
