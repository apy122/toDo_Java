import javaBeans.TaskList;
import org.junit.jupiter.api.Test;

public static void main(String[] args){
    addTaskTest();
    showTaskTest();
}

public class TaskListTest {
    public final TaskList task1 = new TaskList();

    @Test
    //show tasks
    public void showTaskTest() {
        task1.showTask();
    }

    @Test
    // add new task
    public void addTaskTest() {
        task1.addTask("Comprar pan");// add task
    }

    @Test
    // mark task as made
    public void taskMadeTest() {
        task1.taskMade(1);
    }

    @Test
    // remove task of list
    public void removeTaskTest() throws Exception {
        try {
            task1.removeTaskByIndex(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // searchTask: busca una tarea por ID
    public void searchTask() {
        task1.searchTask(1);
    }
}

