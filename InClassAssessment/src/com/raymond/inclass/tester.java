package com.raymond.inclass;

import java.util.LinkedList;
public class tester {

	public static void main(String[] args) 
	{
		BucketList BL = new BucketList();
		
		
		Idea idea1 = new Idea("Dancing", 5, false);
		Idea idea2 = new Idea("skydiving", 10, true);
		Idea idea3 = new Idea("motorrally", 15, false);
		Idea idea4 = new Idea("millionaire", 23, true);
		Idea idea5 = new Idea("rock climbing", 76, false);
		Idea idea6 = new Idea("football player", 89, true);
		Idea idea7 = new Idea("eating", 100, false);
		
		
		/**Testing add idea**/
		BL.addIdea(idea1);
		BL.addIdea(idea2);
		BL.addIdea(idea3);
		BL.addIdea(idea4);
		BL.addIdea(idea5);
		BL.addIdea(idea6);
		BL.addIdea(idea7);

		
		/**testing accessors**/
		System.out.println(idea3.getActivity());
		System.out.println(idea7.getCost());
		System.out.println(idea4.getDone());
		
		System.out.println();
		
		/**Testing ticked**/
		System.out.println(idea1.getDone());
		idea1.ticked();
		System.out.println(idea1.getDone());
		
		System.out.println();
		
		/**Testing getDetails**/
		System.out.println(idea2.getDetails());
		System.out.println(idea3.getDetails());
		
		System.out.println();
		
		/**Testing getsize**/
		System.out.println(BL.getSize());
		Idea idea8 = new Idea("hot air ballooning", 110, true);
		BL.addIdea(idea8);
		System.out.println(BL.getSize());
		
		System.out.println();
		
		/**testing list**/
		
		BL.list();
		
		System.out.println();
		
		/**Testing isinList**/
		
		System.out.println(BL.isInList("hot air ballooning"));
		System.out.println(BL.isInList("HOT AIR BALLOONING" ));
		System.out.println(BL.isInList("BALLOONING" ));
		System.out.println(BL.isInList("nothing"));
		
		System.out.println();
		
		/**Testing most expensive **/
		
		LinkedList<Idea> expensive = new LinkedList<Idea>();
		
		System.out.println(BL.getSize());
		//checks when 0 objects are removed
		expensive = BL.removeExpensiveItems(200);
		
		System.out.println(BL.getSize());
		System.out.println(expensive.size());
		
		expensive = BL.removeExpensiveItems(22);
		
		for (Idea idea : expensive)
		{
			System.out.println(idea.getDetails());
		}
		
		System.out.println(BL.getSize());
		
		System.out.println(expensive.size());
		
		
	}

}
