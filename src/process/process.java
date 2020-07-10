package process;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import scheduler.Event;

public class process implements Iprocess {
	List<Event> events;
	long duration;
	enum Status {
		RUNNING, ENDED, ITERRUPTED
		}
	Status state;
	public process() {
	    this.events= new ArrayList<Event>();
	}

	
	@Override
	public void addEvent(Event event) {
		this.events.add(event);
	}

	@Override
	public void abort(UUID uuid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void execute() {
		this.state = Status.RUNNING;
		// TODO Auto-generated method stub

	}

	@Override
	public void interrupt() {
		this.state = Status.ITERRUPTED;

		// TODO Auto-generated method stub
		
	}

}
