package scheduler;

public class Event2 extends Event {
	long timeStamp;

	@Override
	public void execute() {
		long newTimeStamp = this.timeStamp + 10; 
		StartEvent event1 = new StartEvent();
		this.timeStamp = newTimeStamp;
		this.scheduler.addEventToPq(event1);
		System.out.println(this.scheduler.getCurrentTime());
		
	}

	public Event2(long timeStamp) {
		this.timeStamp = timeStamp +10;
	}


}
