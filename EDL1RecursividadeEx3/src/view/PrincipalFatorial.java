package view;
import controller.ControllerFatorial;
public class PrincipalFatorial {
	public static void main (String[]args) {
		
		ControllerFatorial m = new ControllerFatorial();
		int num = 5;
		int fat = m.Fatorial(num);
		System.out.println("O fatorial de " + num + " é " + fat);
		
	}

}
