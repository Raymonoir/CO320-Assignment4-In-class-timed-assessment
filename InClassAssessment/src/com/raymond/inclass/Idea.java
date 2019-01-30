package com.raymond.inclass;
/**
 * 
 * @author Raymond Ward (rw468)
 * @version 27/11/2018
 * 
 * The idea class stores an idea that is to be on someone's bucket list, 
 * this includes the cost, name and completion of the activity
 * 
 */
public class Idea 
{
	private String activity;
	private int cost;
	private boolean done;
	
	/**
	 * 
	 * @param activity The name of the idea
	 * @param cost The cost of given idea
	 * @param done The completion of the idea
	 */
	public Idea (String activity, int cost, boolean done)
	{
		this.activity = activity;
		this.cost = cost;
		this.done = done;		
		
	}
	/**
	 * The accessor method for activity  field
	 * @return activity, the name of idea
	 */
	
	public String getActivity()
	{
		return this.activity;
		
	}
	/**
	 * The accessor method for cost field
	 * @return cost, the cost of idea
	 */
	public int getCost()
	{
		return this.cost;
		
	}
	
	/**
	 * The accessor method for done field
	 * @return done The completion of idea
	 */
	public boolean getDone()
	{
		return this.done;
		
	}
	
	/**
	 * The mutator method for done field, will set done to true
	 */
	public void ticked()
	{
		this.done = true;
	}
	
	
	/**
	 * A method that gets the description of a given idea
	 * @return a description of given idea, depending on completion
	 */
	public String getDetails ()
	{
		if (getDone())
		{
			return getActivity() + " costs " + getCost() + " (ticked)";
		}
		else
		{
			return getActivity() + " costs " + getCost();
		}
	}

	

}
