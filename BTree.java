package MorseCode;


public class BTree {

	BNode root = new BNode("",50);
	BNode curr;
	
	public void add(String x,int k)
	{
		// Will add nodes based on a numerical key
		//This is to ensure I placed letters in correct positions
		BNode letter = new BNode(x,k);
		
		curr = root;
		BNode parent;
		 
		 while(true)
		 {
			 parent = curr;
			 if(k <= curr.getKey())
			 {
				 curr = curr.getLeft();
				 
				 if(curr == null)
				 {
					 parent.setLeft(letter);
					 return;
				 }
		
				 
			 }
			 else
			 {
				 curr = curr.getRight();
				 
				if(curr == null)
				{
					parent.setRight(letter);
					return;
				}
				 
			 }
		 }
	}
	
	
	
	public void inOrder(BNode f)
	{
		//This method is to check if the tree was being traversed correctly
		if(f != null)
		{
			inOrder(f.getLeft());
			System.out.println(f.getLetter());
			inOrder(f.getRight());
		}
		
	}
	public String Decode(String morse)
	{
		//This method takes in a part of the whole string. will find each letter
		String decoded = " ";
	
		// if the methods gets "" as a parameter it means that there's is a space
		if(morse.equals(""))
			return decoded;
		
		else
		{
			curr = root;
		
			for(int i=0; i<morse.length();i++ )
			{
				if(morse.charAt(i) == '#')
				{
					
				}
					
				else
				{
					if(morse.charAt(i) == '•' || morse.charAt(i) == '.')
					{
						curr = curr.getLeft();
						
					}
					else if(morse.charAt(i) == '-')
					{
						curr=curr.getRight();
						
					}
				}
			}
		}	
		decoded = curr.getLetter();
		
		return decoded;
	}
	
	
	public String DecodeController(String Morse)
	{
		
		//controller method that splits up the Original string
		StringBuilder word = new StringBuilder() ;
		String[] letters;
		int y = 0;
		
		try{
			while(Morse.charAt(y) != '#')
			{
			y++;
			}
	
	
			
			
			//the method will only count everything before the #
			
			letters = Morse.substring(0,y).split("_");
			
			//this loop will call decode the part of the string and append onto a string
			for(int i =0 ; i < letters.length; i++)
			{
			
				String let = Decode(letters[i]);
				word.append(let);
			
			}	
			
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("ERROR MESSAGE: You did not put an # at the end of the coded message!");
		}
		
		return word.toString();
		
	}
	

	public BTree theTree()
	{
		//this method will add all the letters to the tree
		BTree tree = new BTree();
		//Left of root
		tree.add("E", 30);
		
		tree.add("I", 15);
		tree.add("A", 45);
		
		tree.add("S",10);
		tree.add("U",17 );
		tree.add("R",40);
		tree.add("W",47 );
		
		tree.add("H",3 );
		tree.add("V",11);
		tree.add("F",16 );
		tree.add("L",39 );
		tree.add("P",46 );
		tree.add("J",48 );
		
		//right of root
		tree.add("T", 80);
		
		tree.add("N", 70);
		tree.add("M", 90);
		
		tree.add("D",65 );
		tree.add("K",75 );
		tree.add("G",85 );
		tree.add("O",100 );
		
		tree.add("B",55 );
		tree.add("X",66 );
		tree.add("C",73 );
		tree.add("Y",78 );
		tree.add("Z",83 );
		tree.add("Q",87 );
		
		return tree;
		
	}
}
