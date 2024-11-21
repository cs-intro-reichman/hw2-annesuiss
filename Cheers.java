// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	        String inputWord = args[0];
            // guess that the input is > 0
            int reps = Integer.parseInt(args[1]);
            int repsStart = 0;
            int i =0;
            inputWord = inputWord.toUpperCase();
            //String vowelSet = "AEFHILMNORSX";

            while ( i < inputWord.length()){
                System.out.print("give me ");
                if (inputWord.charAt(i) == 'A' || inputWord.charAt(i) == 'E' || inputWord.charAt(i) == 'F' ||
                inputWord.charAt(i) == 'H' || inputWord.charAt(i) == 'I' || inputWord.charAt(i) == 'L' ||
                inputWord.charAt(i) == 'M' || inputWord.charAt(i) == 'N' || inputWord.charAt(i) == 'O' ||
                inputWord.charAt(i) == 'R' || inputWord.charAt(i) == 'S' || inputWord.charAt(i) == 'X')  {
                    System.out.println("an " + inputWord.charAt(i)+ ": " + inputWord.charAt(i)+ "!");
                    i++;
                } else {
                System.out.println("a " + inputWord.charAt(i)+ ": " + inputWord.charAt(i)+ "!");
                i++;

            }
                
                
            }
            System.out.println("What does that spell?") ;
                
            for (int z=0; z < reps; z++) {
                System.out.println(inputWord +" ! ! !");
        
            
        }





        }
}
