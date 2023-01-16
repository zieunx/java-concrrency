package study.concurrency.chapter2;

public class LoggingWidget extends Widget {
    @Override
    public synchronized void doSomething() {
        System.out.println("LoggingWidget: " + this);
        super.doSomething();
    }
}
