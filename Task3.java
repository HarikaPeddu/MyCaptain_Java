import java.util.Scanner;

public class Task3 {
	public void Methods(int n) {
		double min = n;
		double minutesInYear = 60 * 24 * 365;
		long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Task3 t = new Task3();
		t.Methods(n);
		
}
}
