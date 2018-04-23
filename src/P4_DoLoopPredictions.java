/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/22/2018
*/

/*
 How many times do you expect the loop to repeat? Remember that 
 zero, infinity, and unknown are legal answers.
 
 What do you expect the loop to output?
 
 (a)
 Repeats: 9 times
 Expected output: 1 11 21 31 41 51 61 71 81 91
 (b)
 Repeats: Infinite
 Expected output: Count down: (decreasing integers infinitely)
 (c)
 Repeats: Infinite
 Expected output: 250 repeated infinitely
 (d)
 Repeats: Unknown
 Expected output: babbabbab
   
 */

/*
 Was your prediction correct?
 
 (a) Yes
 (b) Yes
 (c) Yes
 (d) No

*/
public class P4_DoLoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		//d
		String word = "a";
		do {
		    word = "b" + word + "b";
		} while( word.length() < 10 );
		System.out.println( word );
		
		System.out.println("ENDING LOOP TEST");

	}

}
