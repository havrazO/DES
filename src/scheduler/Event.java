package scheduler;

import java.util.UUID;

public abstract class Event {
	Scheduler scheduler;
	long timeStamp;
	UUID uuid;
	
	abstract void execute();
	
	// no abort method cuz events are atomar ...etc nicht unterbrechbar wie prozesse 
}
