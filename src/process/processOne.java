package process;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import scheduler.Event;

public class processOne extends process {
	Event startEvent;
	Event endEvent;
	public processOne(Event startEvent, Event endEvent) {
	    this.events= new ArrayList<Event>();
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
