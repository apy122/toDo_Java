package javaBeans;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    // Atributos
    private ArrayList<TaskClass> taskList;
    private Scanner scanner;
    private int index;

    // Constructor
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
    public void addTask() {
    	System.out.println("Enter task description: ");
    	String description=scanner.nextLine();
    	TaskClass newTask= new TaskClass();
        taskList.add(newTask);
        index++;
    }

    // mark task as made
    public void taskMade() {
        System.out.print("Introduce el ID de la tarea terminada: ");
        int y = scanner.nextInt();
        if (y >= 0 && y < taskList.size()) {
            TaskClass task = taskList.get(y); 
            task.timeOutTask();  
            System.out.println("La tarea con ID " + y + " ha sido marcada como terminada.");
        } else {
            throw new IllegalArgumentException("Inserte una opción válida.");
        }
    }

    // remove task of list
    public void removeTask(int id) {
        if (id >= 0 && id < taskList.size()) {
            taskList.remove(id);
            System.out.println("Tarea con ID " + id + " eliminada.");
        } else {
            System.out.println("Índice de tarea no válido.");
        }
    }

    // searchTask: busca una tarea por ID
    public TaskClass searchTask(int id) {
        for (TaskClass task : taskList) {
            if (task.getIdTarea() == id) {
                return task;
            }
        }
        System.out.println("Tarea no encontrada.");
        return null;  // Devuelve null si no encuentra la tarea
    }
}

