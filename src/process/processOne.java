package process;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import scheduler.Event;

public class processOne extends process {

	//public processOne(Event startEvent, Event endEvent) {
		// TODO mybe here add random waiting time to the duration of the process 
	  //  this.events= new ArrayList<Event>();
	//}

	public processOne(Event startEvent, Event endEvent, List<Event> events, long duration) {
		super(startEvent, endEvent, events, duration);
		// TODO Auto-generated constructor stub
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
