
public class HexaObserver extends Observer {
	
	public HexaObserver(Subject subject) {
		this.subject = subject;
	}
	
	public void update() {
		System.out.println("Hexa: Change of State = " + Integer.toHexString(subject.getState()));
	}
	
	
}
