package scheduler;

public abstract class SchedulerEvent {
	Scheduler scheduler;
	long timeStamp;
	
	abstract void execute();
}
