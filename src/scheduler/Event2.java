package scheduler;

public class Event2 extends Event {
	long timeStamp;

	
	public Event2(long timeStamp) {
		this.timeStamp = timeStamp +10;
	}
	@Override
	public void execute() {
		Event1 event1 = new Event1(this.timeStamp);
		this.scheduler.addEventToPq(event1);
		System.out.println(this.scheduler.getCurrentTime());
		
		// or function to change object address

	}



}
