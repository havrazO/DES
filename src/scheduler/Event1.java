package scheduler;

public class Event1 extends Event {

	@Override
	public void execute() {
		long newTimeStamp = this.timeStamp + 10; 
		Event2 event2 = new Event2();
		Event.timeStamp = newTimeStamp;
		this.scheduler.addEventToPq(event2);
		System.out.println(this.scheduler.getCurrentTime());
	}

}
