public class Task implements TaskInterface {
    enum Status{
        COMPLETED,
        IN_PROGRESS,
    }
    private String id;
    private String description;
    private int prioity;
    private int difficulty;
    private Status status;


    public Task(String id, String description,Status status, int prioity, int difficulty) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.prioity = prioity;
        this.difficulty = difficulty;
    }


    public String getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public void editDescription(String desc){
        this.description = desc;
    }
    public void editPrioity(int prio){
        this.prioity = prio;
    }

    @Override
    public void editStatus() {
        switch (status){
            case IN_PROGRESS:
                status = Status.COMPLETED;
                break;
            default:
                status = Status.IN_PROGRESS;
                break;

        }

    }
}
