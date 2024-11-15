package com.mycompany.app;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class ImportanceRegistry<T> implements Registry<ImportanceScore, T> {
   
    private Map<Task<T>, ImportanceScore> tasks;

    public ImportanceRegistry() {
        tasks = new HashMap<Task<T>, ImportanceScore>();
    }

    @Override
    public void registerTask(Task<T> task, ImportanceScore importanceScore) {
        tasks.put(task, importanceScore);
    }

    @Override
    public void unregisterTask(Task<T> task) {
        tasks.remove(task);
    }

    @Override
    public void updateTask(Task<T> task, ImportanceScore importanceScore) {
        tasks.put(task, importanceScore);
    }

    @Override
    public Iterator<Map.Entry<Task<T>, ImportanceScore>> getTasks() {
        return tasks.entrySet().iterator();
    }
}
  