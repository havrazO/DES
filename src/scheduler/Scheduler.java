package scheduler;

import java.util.PriorityQueue;

public class Scheduler {
	
    PriorityQueue<Event> pq;
    
    public Scheduler() {
		this.pq = new PriorityQueue<>();
	}
	public void addEventToPq(Event event) {
		//TODO add event to  priority queue
		this.pq.add(event);
	}

	public String getCurrentTime() {
		// TODO Auto-generated method stub
		
		return java.time.LocalDateTime.now().toString();
	}
	
	

}
