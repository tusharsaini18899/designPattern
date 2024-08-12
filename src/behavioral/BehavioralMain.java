package behavioral;

import behavioral.observer.NewsAgency;
import behavioral.observer.NewsChannel1;
import behavioral.observer.NewsChannel2;
import behavioral.strategy.AddOperation;
import behavioral.strategy.Context;
import behavioral.strategy.MultiplyOperation;
import behavioral.strategy.SubtractOperation;

public class BehavioralMain {
    public static void main(String[] args) {

        // Strategy
        // lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
        // when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
        System.out.println("********************  Strategy Start  *************************");
        Context add=new Context(new AddOperation());
        add.executeOperation(5,4);
        Context sub=new Context(new SubtractOperation());
        sub.executeOperation(5,4);
        Context multiply=new Context(new MultiplyOperation());
        multiply.executeOperation(5,4);
        System.out.print("\n\n");

        // iterator -> to traverse the different-different Collections objects


        // observer
        // lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.
        System.out.println("********************  Observer Start  *************************");
        NewsAgency newsAgency=new NewsAgency();
        newsAgency.addObserver(new NewsChannel1());
        newsAgency.addObserver(new NewsChannel2());
        newsAgency.setNews("Hello! this is new news");

    }
}
