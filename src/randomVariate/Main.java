package randomVariate;

import PRandom.PRandom;
import scheduler.Event;
import scheduler.Event1;

public class Main {

	public static void main(String[] args) {
		PRandom randomList1 = new PRandom(7);
		randomList1.generate(20).forEach(result -> System.out.print(result + " , "));
		System.out.println('\n');
		PRandom randomList2 = new PRandom(7);
		randomList2.generate(10).forEach(result -> System.out.print(result + " , ")); 
		
		Event event1 = new Event1();
	}

}
