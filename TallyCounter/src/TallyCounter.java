/**
 *
 * @author rlong19
 *
 */
public class TallyCounter 
{
	//fields
	private int count;
	
	//constructors
	public TallyCounter()
	{
		count = 0;	
	}
	
	public TallyCounter(int a)
	{
		count = a;
	}
	public void click()
	{
		//shortcut for count = count+!
		//you could also do count += 1 (or count += 10, whatever #) ((or count *= x))
		count++;
	}
	public int getCount()
	{
		return count;
	}
	public void reset()
	{
		count = 0;
	}
	public void unclick()
	{
		count-= 1;
	}
}
