package org.example.homework.second.shop;

public class Shop {
    Worker[] workers;

    public Shop(Worker... workers) {
        this.workers = workers;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void printAll() {
        for (Worker worker : workers) {
            System.out.println(worker.getName());
        }
    }
}