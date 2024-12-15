package javaBeans;

import com.sun.source.util.TaskListener;

import java.util.Scanner;

public class TaskClass {
		private String name;
		private int idTask;
		private String timeOutDate;
		private boolean isTimeOut;
		private Scanner scanner;
		private boolean isMade;
		private TaskList task2= new TaskList();
		public TaskClass() {
			super();
		}

		//geter and seter
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getIdTask() {
			return idTask;
		}

		public void setIdTask(int idTask) {
			this.idTask = idTask;
		}

		public String getTimeOutDate() {
			return timeOutDate;
		}

		public void setTimeOutDate(String timeOutDate) {
			this.timeOutDate = timeOutDate;
		}

		public boolean isTimeOut() {
			return isTimeOut;
		}

		public void setTimeOut(boolean isTimeOut) {
			this.isTimeOut = isTimeOut;
		}

		public Scanner getScanner() {
			return scanner;
		}

		public void setScanner(Scanner scanner) {
			this.scanner = scanner;
		}

		public boolean getisMade() {
			return isMade;
		}

		public void setMade(boolean isMade) {
			this.isMade = isMade;
		}

		public TaskList getTask2() {
			return task2;
		}

		public void setTask2(TaskList task2) {
			this.task2 = task2;
		}

		public void updateIdTask() {
			for (idTask=1; idTask<task2.getTaskList().size();idTask++) {
				idTask ++;
			}
		}
		public void timeOutTask() {
			this.isTimeOut=true;
		}
		
		public void isMadeTask() {
			this.isMade=true;
		}
	}

















