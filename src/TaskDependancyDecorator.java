import java.util.List;

public class TaskDependancyDecorator extends  BaseTaskDecorator{
    public List<Task> dependsOn;

    public TaskDependancyDecorator(TaskInterface wrapped) {
        super(wrapped);
    }

    public void addDependancy(Task task){
        dependsOn.add(task);
    }

    public void removeDependancy(Task task){
        dependsOn.remove(task);
    }
}
