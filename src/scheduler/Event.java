package scheduler;

import java.util.UUID;

public abstract class Event {
	Scheduler scheduler;
	long timeStamp;
	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	UUID uuid;
	
	abstract void execute();
	
	// no abort method cuz events are atomar ...etc nicht unterbrechbar wie prozesse 
}
