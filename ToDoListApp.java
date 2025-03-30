import java.util.Scanner;

public class ToDoListApp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        String command; //String command variable is used to store the user's input command from the console.

        System.out.println("WELCOME TO THE TO-DO LIST APP!!");
        do{
            System.out.println("\nAvailable commands: add, remove, complete, list, exit");
            System.out.print("Enter command: ");
            command=sc.nextLine();

            switch(command){
                case "add":
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    toDoList.addTask(task);
                    break;  
                case "remove":
                    System.out.println("enter the task id to remove: ");
                    int removeId= Integer.parseInt(sc.nextLine());
                    toDoList.removeTask(removeId);
                    break;
                case "complete":
                    System.out.print("Enter task ID to mark as completed: ");
                    int completeId = Integer.parseInt(sc.nextLine());
                    toDoList.markCompleted(completeId);
                    break;
                case "list":
                    toDoList.displayTasks();
                    break;
                case "exit":
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Unknown command. Please try again.");
            }

        }while(!command.equals("exit"));
        sc.close();
        }
    
}
