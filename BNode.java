package MorseCode;

public class BNode {

	private BNode left;
	private BNode right;
	private int key;
	
	private String letter;
	
	public BNode(String letter,int key)
	{
		this.key = key;
		this.letter = letter;
	}
	
	//getters
	public BNode getLeft()
	{
		return left;
	}
	public BNode getRight()
	{
		return right;
	}
	public String getLetter()
	{
		return letter;
	}
	public int getKey()
	{
		return key;
	}
	
	//Setters
	public void setLeft(BNode l)
	{
		left = l;
	}
	public void setRight(BNode r)
	{
		right = r;
	}
	public void setLeft(int k)
	{
		key = k;
	}
	
}
