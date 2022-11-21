package study.concurrency.chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggingWidgetTest {
    @Test
    public void 암묵적_락_재진입성() {
        LoggingWidget loggingWidget = new LoggingWidget();

        loggingWidget.doSomething();
    }
}