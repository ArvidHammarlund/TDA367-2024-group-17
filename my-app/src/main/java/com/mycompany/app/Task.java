package com.mycompany.app;

import java.util.List;

public class Task<T> {
    private String title;
    private List<T> entries;
    private List<TaskObserver<T>> observers;
 
    public Task(String title, List<T> entries) {
        this.title = title;
        this.entries = entries;
    }

    public void addObserver(TaskObserver<T> observer) {
        observers.add(observer);
    }

}

class TaskObserver<T> {
    public void update(Task<T> task) {
        System.out.println("Task updated: " + task);
    }
}
