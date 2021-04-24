import java.util.Scanner;

public class Task4 {
	public void Loops(int n) {
		switch(n) {
		case 1: System.out.println("You Said Hi");
				break;
		case 2: System.out.println("You Said Hey");
				break;
		case 3: System.out.println("You Said Hello");
				break;
		default : System.out.println("Invalid Choice");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Task4 t = new Task4();
		t.Loops(n);
	}
}
