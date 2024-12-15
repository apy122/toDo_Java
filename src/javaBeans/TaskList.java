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
    public void addTask() {
        System.out.println("Enter task name: ");
        String name = scanner.nextLine();

        System.out.println("Enter task timeout date : ");
        String timeOutDate = scanner.nextLine();

        System.out.println("Is the task already made? (true/false): ");
        boolean isMade = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Is the task timed out? (true/false): ");
        boolean isTimeOut = scanner.nextBoolean();
        scanner.nextLine();

        // Crear una nueva tarea
        TaskClass newTask = new TaskClass();
        newTask.setName(name);
        newTask.setTimeOutDate(timeOutDate);
        newTask.setMade(isMade);
        newTask.setTimeOut(isTimeOut);

        // Asignar un ID único para la tarea, basado en el índice de la lista
        newTask.setIdTask(index + 1);

        // Agregar la nueva tarea a la lista
        taskList.add(newTask);
        index++;
        System.out.println("Task added successfully.");
    }


    // mark task as made
    public void taskMade(int idTask) {
        TaskClass taskToUpdate = null;
        // Buscar la tarea con el idTask dado
        for (TaskClass task : taskList) {
            if (task.getIdTask() == idTask) {
                taskToUpdate = task;
                break; // Salir del bucle una vez que encontremos la tarea
            }
        }
        
        // Si encontramos la tarea, la marcamos como hecha
        if (taskToUpdate != null) {
            taskToUpdate.setMade(true); // Suponiendo que tienes un setter `setMade()`
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
    
    // searchTask: busca una tarea por ID
    public TaskClass searchTask(int id) {
        for (TaskClass task : taskList) {
            if (task.getIdTask() == id) {
                return task;
            }
        }
        System.out.println("Tarea no encontrada.");
        return null;  // Devuelve null si no encuentra la tarea
    }
}

