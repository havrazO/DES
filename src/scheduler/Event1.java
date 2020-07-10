package scheduler;

import java.util.UUID;

public class Event1 extends Event {
	long timeStamp;

	public Event1(long timeStamp) {
		this.timeStamp = timeStamp + 10;
		uuid = UUID.randomUUID();
	}

	@Override
	public void execute() {
		
		Event2 event2 = new Event2(this.timeStamp);
		this.scheduler.addEventToPq(event2);
		System.out.println(this.scheduler.getCurrentTime());
		
		// or function to change object person
	}

}
