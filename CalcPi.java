// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		System.out.println("pi according to Java: " + Math.PI);
		double myPI = 0.0;

		for (int i = 1;i < n+1;i++) {
			myPI += Math.pow(-1, i) / (2 * i + 1);
		}
		double myPIDouble = myPI * 4;

		System.out.println("pi according to Java: " + myPIDouble);

	}
}
