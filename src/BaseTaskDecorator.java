public abstract class BaseTaskDecorator implements TaskInterface {
    private final TaskInterface wrapped;

    public BaseTaskDecorator(TaskInterface wrapped) {
        this.wrapped = wrapped;

    }


    @Override
    public void editDescription(String desc) {
        wrapped.editDescription(desc);
    }

    @Override
    public void editStatus(){
        wrapped.editStatus();
    }

}
