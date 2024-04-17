package io.github.tomhuel.Timers;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class AddTimer {
    public static void execute() {

        // Toolkit
        Toolkit tk = Toolkit.getDefaultToolkit();

        // Integer to count
        AtomicInteger counter = new AtomicInteger(0);

        Timer timer = new Timer();
        TimerTask task1 = new TimerTask() {
            @Override
            public void run() {
                int i = counter.getAndIncrement();
                if (i >= 10) {
                    timer.cancel();
                } else {
                    tk.beep();
                    System.out.println("Executing periodic task at thread " + Thread.currentThread().getName());
                }
            }
        };
        timer.schedule(task1, 0, 3000);
    }
}
