package scheduler;

public class StartEvent extends Event {
	long timeStamp;

	@Override
	public void execute() {
		long newTimeStamp = this.timeStamp + 10; 
		Event2 event2 = new Event2(newTimeStamp);
		this.timeStamp = newTimeStamp;
		this.scheduler.addEventToPq(event2);
		System.out.println(this.scheduler.getCurrentTime());
	}

}
