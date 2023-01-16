package study.concurrency.chapter2;

public class Widget {
    public synchronized void doSomething() {
        System.out.println("Widget: " + this);
    }
}
