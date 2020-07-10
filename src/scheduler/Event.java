package scheduler;

public abstract class Event {
	Scheduler scheduler;
	long timeStamp;
	
	abstract void execute();
	
	// no abort method cuz events are atomar ...etc nicht unterbrechbar wie prozesse 
}
