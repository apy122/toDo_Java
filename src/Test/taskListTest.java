package Test;
import javaBeans.TaskList;

public class taskListTest {
	public static final TaskList tsk1= new TaskList();
	public static void main(String[] args) throws Exception {
		showtaskTest();
		addTaskTest1();
		addTaskTest2();
		showtaskTest();
		addTaskTest3();
		addTaskTest4();
		taskMadeTest();
		removeTaskTest();
		showtaskTest();
	}
	public static void showtaskTest() {
		tsk1.showTask();
	}
	public static void addTaskTest1(){
		tsk1.addTask("study", "11/december", false, false);// add study as task
	}
	public static void addTaskTest2(){
		tsk1.addTask("buy jamb", "14/november", false, false);// add buy jamb as task
	}
	public static void addTaskTest3(){
		tsk1.addTask("send lotery", "1/september", false, false);// add send lotery as task
	}
	public static void addTaskTest4(){
		tsk1.addTask("see tv", "25/july", false, false);// add see tv as task
	}
	public static void taskMadeTest() {
		tsk1.taskMade(2); // mark buy jamb as made
	}
	public static void removeTaskTest() throws Exception {
		tsk1.removeTaskByIndex(1);
	}
}
