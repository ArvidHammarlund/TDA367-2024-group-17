public class TaskDeadlineDecorator extends BaseTaskDecorator {
    private String dueDate;

    public TaskDeadlineDecorator(TaskInterface wrapped, String dueDate) {
        super(wrapped);
        this.dueDate = dueDate;
    }

    public void editDueDate(String dueDate){
        this.dueDate = dueDate;
    }

    public String getDueDate(){
        return this.dueDate;
    }


}
