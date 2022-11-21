package study.concurrency.chapter3;

public class Widget {
    public synchronized void doSomething() {
        System.out.println("Widget: " + this);
    }
}
