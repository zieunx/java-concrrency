package study.concurrency.chapter3;

public class LoggingWidget extends Widget {
    @Override
    public synchronized void doSomething() {
        System.out.println("LoggingWidget: " + this);
        super.doSomething();
    }
}
