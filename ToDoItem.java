public class ToDoItem {

    private int id;
    private String task;    //task description
    private boolean isCompleted;    //status of the task

    //create a constructor initialise the todo item
    public ToDoItem(int id, String task){
        this.id=id;
        this.task=task;
        this.isCompleted=false;
    }
    
    //getter for the id
    public int getId() {
        return id;
    }

    //getter for the task
    public String getTask() {
        return task;
    }

    //check if task is completed
    public boolean isCompleted(){
        return isCompleted;
    }

    //mark task  completed
    public void markCompleted(){
        this.isCompleted=true;
    }

    //override tostring method to display in correct form
    public String toString(){
        return "[" + (isCompleted ? "X" : " ") + "]" + task;
    }
}