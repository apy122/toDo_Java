package javaBeans;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    // Atributes
    private ArrayList<TaskClass> taskList;
    private Scanner scanner;
    private int index;

    // builder
    public TaskList() {
        this.taskList = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.index = 0;
    }

    // Getters and setters
    public ArrayList<TaskClass> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<TaskClass> taskList) {
        this.taskList = taskList;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    
    //toString
    @Override
   	public String toString() {
   		return "TaskList [taskList=" + taskList + ", scanner=" + scanner + ", index=" + index + "]";
   	}
    
    //show tasks
    public void showTask() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < taskList.size(); i++) {
                TaskClass task = taskList.get(i);
                System.out.println("Tasks:" + taskList);
            }
         }
    }


	// add new task
 // add new task
    public void addTask(String name, String timeOutDate, boolean isMade, boolean isTimeOut) {

        // create new task
        TaskClass newTask = new TaskClass();
        newTask.setName(name);
        newTask.setTimeOutDate(timeOutDate);
        newTask.setMade(isMade);
        newTask.setTimeOut(isTimeOut);

        //Asign id to task
        newTask.setIdTask(index + 1);

        // add task to tasklist
        taskList.add(newTask);
        index++;
        System.out.println("Task added successfully.");
    }


    // mark task as made
    public void taskMade(int idTask) {
        TaskClass taskToUpdate = null;
        // search task in tasklist
        for (TaskClass task : taskList) {
            if (task.getIdTask() == idTask) {
                taskToUpdate = task;
                break;
            }
        }
        
        //if found mask as done
        if (taskToUpdate != null) {
            taskToUpdate.setMade(true);
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Task not found.");
        }
    }


    // remove task of list
    public void removeTaskByIndex(int index) throws Exception {  
        if (index >= 0 && index < taskList.size()) {
            taskList.remove(index);
            System.out.println("Tarea con índice " + index + " eliminada.");
        } else {
            throw new Exception("Índice de tarea no válido.");
        }
    }
    
    // search task
    public TaskClass searchTask(int id) {
        for (TaskClass task : taskList) {
            if (task.getIdTask() == id) {
                return task;
            }
        }
        System.out.println("Tarea no encontrada.");
        return null;
    }
}

