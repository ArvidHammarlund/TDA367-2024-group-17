import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Testing {


    @Test
    public void createSimpleTaskAndCheckID() {
        Task task = new Task("First Task", "No description", Task.Status.IN_PROGRESS, 0, 0);
        assertEquals("First Task", task.getId());
    }

    @Test
    public void createSimpleTaskAndCheckDescription() {
        Task task = new Task("First Task", "No description", Task.Status.IN_PROGRESS, 0, 0);
        task.editDescription("This is a description");
        assertEquals("This is a description", task.getDescription());
    }

    @Test
    public void createWrappedTask() {
        TaskInterface task = new TaskDeadlineDecorator(new Task("DeadlineWrapped", "No Description", Task.Status.IN_PROGRESS, 0, 0), "Tomorrow");
        TaskDeadlineDecorator deadlineTask = (TaskDeadlineDecorator) task;
        deadlineTask.editDueDate("New DueDate");
        task.editDescription("New Description");
        assertEquals("New DueDate", ((TaskDeadlineDecorator) task).getDueDate());

    }

    @Test
    public void createMultiWrappedTask() {
        TaskInterface task = new TaskDeadlineDecorator(new TaskRecurrenceDecorator(new Task("DeadlineWrapped", "No Description", Task.Status.IN_PROGRESS, 0, 0), "Every hour"), "Tomorrow");
        TaskRecurrenceDecorator recurrenceTask = (TaskRecurrenceDecorator) task;
        recurrenceTask.editFrequency("Every Minute");

//        TaskInterface task = new Task("DeadlineWrapped", "No Description", Task.Status.IN_PROGRESS, 0, 0);
//        TaskRecurrenceDecorator recurrenceTask = new TaskRecurrenceDecorator(task, "Every hour");
//        TaskDeadlineDecorator deadlineTask = new TaskDeadlineDecorator(recurrenceTask, "Tomorrow");
//        deadlineTask.editDueDate("New DueDate");
//        recurrenceTask.editFrequency("Every Minute");
//        assertEquals(recurrenceTask.getRecurrenceFrequency(), "Every Minute");

    }
}
