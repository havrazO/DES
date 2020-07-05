package simulations;

import PRandom.PRandom;
import scheduler.Event;
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
		//rand.generate(20).forEach(result -> System.out.print(result + " , "));
	}
	
}
