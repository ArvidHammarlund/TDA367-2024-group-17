public class TaskRecurrenceDecorator extends BaseTaskDecorator{

    private String recurrenceFrequency;

    public TaskRecurrenceDecorator(TaskInterface wrapped, String frequency) {
        super(wrapped);
        this.recurrenceFrequency = frequency;
    }

    public void editFrequency(String newFrequency) {
        this.recurrenceFrequency = newFrequency;
    }

    public String getRecurrenceFrequency() {
        return recurrenceFrequency;
    }

}
