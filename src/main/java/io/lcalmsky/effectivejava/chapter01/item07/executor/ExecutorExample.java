package io.lcalmsky.effectivejava.chapter01.item07.executor;

import java.util.concurrent.*;

public class ExecutorExample {

    //    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newScheduledThreadPool(10);
//        for (int i = 0; i < 100; i++) {
//            executorService.submit(new Task());
//        }
//        System.out.println(Thread.currentThread() + " hello");
//        executorService.shutdown();
//    }
//    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        for (int i = 0; i < 100; i++) {
//            executorService.submit(new Task());
//        }
//        System.out.println(Thread.currentThread() + " hello");
//        executorService.shutdown();
//    }
//    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        for (int i = 0; i < 100; i++) {
//            executorService.submit(new Task());
//        }
//        System.out.println(Thread.currentThread() + " hello");
//        executorService.shutdown();
//    }
//
//    public static void main(String[] args) {
//        int numberOfCpu = Runtime.getRuntime().availableProcessors();
//        System.out.println("numberOfCpu = " + numberOfCpu);
//        ExecutorService executorService = Executors.newFixedThreadPool(numberOfCpu);
//        for (int i = 0; i < 100; i++) {
//            executorService.submit(new Task());
//        }
//        System.out.println(Thread.currentThread() + " hello");
//        executorService.shutdown();
//    }
//    static class Task implements Runnable {
//
//        @Override
//        public void run() {
//            System.out.println(Thread.currentThread() + " world");
//        }
//    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfCpu = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfCpu);
        Future<String> submit = executorService.submit(new Task());
        System.out.println(Thread.currentThread() + " hello");
        System.out.println(submit.get());
        executorService.shutdown();
    }

    static class Task implements Callable<String> {

        @Override
        public String call() throws InterruptedException {
            Thread.sleep(1000L);
            return Thread.currentThread() + " world";
        }
    }
}
