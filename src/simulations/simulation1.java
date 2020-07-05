package simulations;

import PRandom.PRandom;
import scheduler.Event;
import scheduler.Event1;
import scheduler.Event2;
import scheduler.Scheduler;

public class simulation1 {
	
	PRandom rand;
	Scheduler scheduler;
	Event[] eventsGroup; //events familie ?
	
	public simulation1(int randlambdaValue, Scheduler scheduler) {
		this.rand = new PRandom(randlambdaValue);;
		this.scheduler  = new Scheduler();
	}

	public void start() {
		Event1 event1 = new Event1(0);
		Event2 event2 = new Event2(2);
		this.scheduler.addEventToPq(event1);
		this.scheduler.addEventToPq(event2);
		//rand.generate(20).forEach(result -> System.out.print(result + " , "));
	}
	
}
