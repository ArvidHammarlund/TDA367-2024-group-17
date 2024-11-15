package com.mycompany.app;

import java.util.Iterator;
import java.util.Map;

public interface Registry<T, V> {
    void registerTask(Task<V> task, T additionalInfo);
    void unregisterTask(Task<V> task);
    void updateTask(Task<V> task, T additionalInfo);
    Iterator<Map.Entry<Task<V>, T>> getTasks();
}

