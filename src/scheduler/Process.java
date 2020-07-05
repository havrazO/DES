package scheduler;
import java.util.Date;

public class Process {
	  Date date;
	  enum State {
		  RELEASED,
		  WANTED,
		  HELD
		}
	  State state;
	  
	  public Process() {
		this.state = State.RELEASED;
	}
	  
	  public void sendRequest(int request, Date time) {}
	
}
