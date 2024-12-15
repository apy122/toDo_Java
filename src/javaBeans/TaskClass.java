package javaBeans;

import java.util.Scanner;

public class TaskClass {
		private String nombre;
		private int idTarea;
		private String fechaVencimiento;
		private boolean estaVencida;
		private Scanner scanner;
		public TaskClass() {
			super();
		}
		

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getIdTarea() {
			return idTarea;
		}

		public void setIdTarea(int idTarea) {
			this.idTarea = idTarea;
		}

		public String getFechaVencimiento() {
			return fechaVencimiento;
		}

		public void setFechaVencimiento(String fechaVencimiento) {
			this.fechaVencimiento = fechaVencimiento;
		}

		public boolean isEstaVencida() {
			return estaVencida;
		}

		public void setEstaVencida(boolean estaVencida) {
			this.estaVencida = estaVencida;
		}

		public Scanner getScanner() {
			return scanner;
		}

		public void setScanner(Scanner scanner) {
			this.scanner = scanner;
		}

		@Override
		public String toString() {
			return "Task{" +
					"nombre='" + nombre + '\'' +
					", idTarea=" + idTarea +
					", fechaVencimiento='" + fechaVencimiento + '\'' +
					", estaVencida=" + estaVencida +
					", scanner=" + scanner +
					'}';
		}

		public void updateIdTarea() {
			for (idTarea=1; idTarea<100 ;idTarea++) {
				idTarea++;
			}
		}
		public void timeOutTask() {
			this.estaVencida=true;
		}
	}
