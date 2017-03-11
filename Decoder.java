package MorseCode;

import java.util.Scanner;

public class Decoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BTree tree = new BTree();
		tree =tree.theTree();
		//tree.inOrder(tree.root);
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("This program will decode morse code using • and -.\nTo make a •, press "
				+ "alt and 7 at the same time. Or you can use the period(.) in place of •");
		System.out.println("Use '_' to got to next letter and '__' underscore twice to add a space.");
		System.out.println("To end put a hastag'#'\n");
		System.out.println("Here is the Guide");
		System.out.println(
							"'A',•-		'B',-•••\n"+
							"'C',-•-• 	'D', -••\n"+				
							"'E',•		'F',••-•\n"+
							"'G',--•		'H',••••\n"+
							"'I',••		'J',•---\n"+
							"'K',-•- 	'L',•-••\n"+		
							"'M',--		'N',-•	\n"+
							"'O',---		'P',•--•\n"+
							"'Q',--•-	'R',•-• \n"+
							"'S',•••		'T',-	\n"+
							"'U',••-		'V',•••-\n"+
							"'W',•--		'X',-••-\n"+
							"'Y',-•--	'Z',--••\n"
				);
		System.out.println("What shall we decode?");
		String choice = "";
		String word; 
		
		//tree.inOrder(tree.root);
		 do
		 {
			 System.out.print("Morse Code: ");
			 String message = kb.next();
			 
			 word = tree.DecodeController(message);
			 System.out.println("Decoded Message: "+ word);
			 
			 System.out.println("Would you like to try again? Y/N");
			 choice = kb.next();
			 //System.out.println("\n");
			 
		 }while(choice.equals("Y") || choice.equals("y"));
		
		 System.out.println("Goodbye");
		 kb.close();
	}

}
