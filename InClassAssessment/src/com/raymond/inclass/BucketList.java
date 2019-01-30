package com.raymond.inclass;
import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author Raymond Ward (rw468)
 * @version 27/11/2018
 * 
 * The BucketList class creates a LinkedList that can store multiple Idea objects, acting as a physical 
 * tick list for ideas
 *
 */
public class BucketList 
{
	
	private LinkedList <Idea> bucketList = new LinkedList <Idea>();
	/**
	 * addIdea method that will add an idea to the bucket list
	 * 
	 * @param idea The given idea to be added to the bucket list
	 */
	public void addIdea (Idea idea)
	{
		bucketList.add(idea);
	}
	/**
	 * A method that returns the current size of the bucket list
	 * 
	 * @return bucketList.size() The current size of BucketList
	 */
	public int getSize()
	{
		return bucketList.size();
	}
	
	/**
	 * A method that outputs the details of each idea within BucketList
	 */
	public void list ()
	{
		for (Idea idea : bucketList)
		{
			System.out.println(idea.getDetails());
		}
	}
	
	/**
	 *A method that checks whether a given activity name is contained within the BucketList
	 *
	 * @param ideaName The name (activty) of the idea we are searching for 
	 * @return A boolean result depending on if the idea name was found or not 
	 */

	public boolean isInList (String ideaName)
	{
		boolean found = false;
		
		for (Idea idea : bucketList)
		{
			if (idea.getActivity().toLowerCase().equals(ideaName.toLowerCase()))
			{
				found = true;
			}
		}
		
		return found;
		
	}
	/**
	 * A method which will search through the BucketList and remove any Idea that is above the given cost
	 * It will then add that idea to a new LinkedList to be returned
	 * 
	 * @param maxCost The maximum cost an Idea cane be without being removed
	 * @return tooExpensive A LinkedList containing all Idea objects too expensive for BucketList
	 */
	
	public LinkedList<Idea> removeExpensiveItems(int maxCost)
	{
		LinkedList <Idea> tooExpensive = new LinkedList<Idea>();
		Iterator<Idea> iterator = bucketList.iterator();
		
		
		while (iterator.hasNext())
		{
			Idea nextItem = iterator.next();
			if (nextItem.getCost() > maxCost)
			{
				tooExpensive.add(nextItem);
				iterator.remove();
			}
		}
		
		return tooExpensive;
		
	}
	
}
