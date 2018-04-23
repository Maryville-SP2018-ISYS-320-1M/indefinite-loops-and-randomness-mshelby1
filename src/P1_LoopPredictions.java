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
 Repeats: 0 times
 Expected output: nothing
 (c)
 Repeats: Infinite times
 Expected output: 250 (Repeated infinitely)
 (d)
 Repeats: Unknown
 Expected output: Unknown
   
 */

/*
 Was your prediction correct?
 
 (a) Yes
 (b) Yes
 (c) Yes
 (d) No

*/
public class P1_LoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		// d
		String word = "a";
		while( word.length() < 10 ) {
		    word = "b" + word + "b";
		}
				
		System.out.println("ENDING LOOP TEST");
	}

}
