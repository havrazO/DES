package process;

import java.util.UUID;

import scheduler.Event;

public interface Iprocess {

	public void addEvent(Event event);
	public void abort(UUID uuid);
	public void execute();
	public void interrupt();
}
