package scheduler;

public class Event2B extends SchedulerEvent {

	@Override
	public void execute() {
		long newTimeStamp = this.timeStamp + 10; 
		OkEvent okEvent = new OkEvent();
		okEvent.scheduler = this.scheduler;
		okEvent.timeStamp = newTimeStamp;
		this.scheduler.sendEvent(okEvent);
		System.out.println(this.scheduler.getCurrentTime());
	}

}
