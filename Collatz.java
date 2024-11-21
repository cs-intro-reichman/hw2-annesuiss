// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seedMax = Integer.parseInt(args[0]);
		String mode = args[1];

		//loop 1 seed 1 to N
		for (int currentSeed = 1; currentSeed <= seedMax; currentSeed++)
		{
			int seed = currentSeed;
			int stepCounter = 1;
			if (mode.equals("v")){
				System.out.print(seed + " ");
			}
			if(seed % 2 == 0)
			{
				seed = seed/2;
			} else {
				seed = seed*3+1;
			}
			stepCounter++;

			while(seed > 1){
				stepCounter++;
				if (mode.equals("v")){
					System.out.print(seed +" ");
				}
				if(seed % 2 == 0)
				{
					seed = seed/2;
				} else {
					seed = seed*3+1;
				}		
			}
			
			if (mode.equals("v")){
				System.out.print(seed + " ");
				System.out.println("("+stepCounter+")");
			}
			
		} 
		System.out.println("Every one of the first " + seedMax+ " hailstone sequences reached 1.");	
	}
}
