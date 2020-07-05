package scheduler;

public abstract class Event {
	Scheduler scheduler;
	long timeStamp;
	
	abstract void execute();
}
