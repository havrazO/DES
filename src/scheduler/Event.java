package scheduler;

public abstract class Event {
	Scheduler scheduler;
	static long timeStamp;
	
	abstract void execute();
}
