package javaBeans;

public class TaskListTest {
	static final TaskList task1= new TaskList();
	
	public static void main(String[] args){
		

	}
	
	    //show tasks
	    public void showTaskTest() {
	        task1.showTask();
	    }

	    // add new task
	    public void addTaskTest() {
	        task1.addTask();// add task
	    }

	    // mark task as made
	    public void taskMadeTest() {
	        task1.taskMade(1);
	    }

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
