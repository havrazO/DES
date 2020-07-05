package scheduler;

public class Event2 extends Event {

	@Override
	public void execute() {
		long newTimeStamp = this.timeStamp + 10; 
		Event1 event1 = new Event1();
		Event1.timeStamp = newTimeStamp;
		this.scheduler.addEventToPq(event1);
		System.out.println(this.scheduler.getCurrentTime());
		
	}


}
