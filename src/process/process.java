package process;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import process.process.Status;
import scheduler.Event;

public abstract class process {
	List<Event> events;
	long duration;
	enum Status {
		RUNNING, ENDED, ITERRUPTED
		}
	Status state;
	public final void addEvent(Event event) {
	this.events.add(event);
	if (events.size() > 1 ) {
		this.duration =	Collections.max(events, Comparator.comparing(e -> e.getTimeStamp())).getTimeStamp() - 
						Collections.min(events, Comparator.comparing(e -> e.getTimeStamp())).getTimeStamp(); // nicht ganz richtig(dauer des letzten ereignis !!)
		}
	}
	
	public void abort(UUID uuid) {
	}
	public void execute() {
	}
	public void interrupt() {
	}
}
