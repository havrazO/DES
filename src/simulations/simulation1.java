package simulations;

import PRandom.PRandom;
import scheduler.Event;
import scheduler.Event1;
import scheduler.Event2;
import scheduler.Scheduler;
import umontreal.ssj.probdist.PoissonDist;
import umontreal.ssj.randvar.RandomVariateGenInt;
import umontreal.ssj.rng.LFSR113;
import umontreal.ssj.rng.RandomStream;

public class simulation1 {
	RandomStream stream = new LFSR113("LFSR113");
	private RandomVariateGenInt genN;
	//PRandom rand;
	Scheduler scheduler;
	Event[] eventsGroup; //events familie ?
	
	public simulation1(int randlambdaValue) {
		//this.rand = new PRandom(randlambdaValue);;
		genN = new RandomVariateGenInt(this.stream, new PoissonDist (randlambdaValue));
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
