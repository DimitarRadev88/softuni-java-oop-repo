package com.solid.lab.dependencyInvertion.worker;

public class Manager {

    private Worker worker;

    public Manager(Worker worker) {
        setWorker(worker);
    }

    public void makeWorkerWork() {
        worker.work();
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
}
