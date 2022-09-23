package br.com.leogaona.aeronlabs;

import lombok.extern.slf4j.Slf4j;
import org.agrona.concurrent.ShutdownSignalBarrier;

@Slf4j
public class App {

    public static void main(String[] args) {
        log.info("starting app");

        var signal = new ShutdownSignalBarrier();

        signal.await();
        log.info("shutdown signal received. bye bye");
        System.exit(0);
    }
}
