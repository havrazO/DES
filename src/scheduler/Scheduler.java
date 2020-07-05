package scheduler;

import java.util.PriorityQueue;

public class Scheduler {
	
    PriorityQueue<SchedulerEvent> events;
    
    public void Scheduler() {
		this.events = new PriorityQueue<>();
	}
	public void sendEvent(SchedulerEvent event) {
		//TODO add event to  priority queue
		this.events.add(event);
	}

	public long getCurrentTime() {
		// TODO Auto-generated method stub
		
		return 23423423;
	}
	
	

}
