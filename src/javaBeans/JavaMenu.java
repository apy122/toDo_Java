package javaBeans;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaMenu {
    private int option;
    private final Scanner scanner=new Scanner(System.in);
    private ArrayList<String>menu;
    // Crear el menú
    private void createMenu() {
        menu.add("1. Mostrar lista de tareas");
        menu.add("2. Agregar tarea");
        menu.add("3. Mark task done");
        menu.add("4. Eliminar tarea");
        menu.add("5. Buscar tarea");
        menu.add("6. Salir");
    }

    // Mostrar el menú y gestionar opciones
    public void showMenu() {
        while (option != 4) {
            System.out.println("\n==== Menú ====");
            for (String menuItem : menu) {
                System.out.println(menuItem);
            }
            System.out.print("Selecciona una opción: ");
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine(); 
                handleOption(option);
            } else {
                System.out.println("Por favor, introduce un número válido.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    // Manejar las opciones del menú
    private void handleOption(int option) {
        switch (option) {
            case 1:
                //showTasks();
                break;
            case 2:
                //addTask();
                break;
            case 3:
                //removeTask();
                break;
            case 4:
                //taskMade();
            case 5:
                //searchTask();
            case 6:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }
}