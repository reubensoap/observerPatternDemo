
public class BinaryObserver extends Observer {
	public BinaryObserver(Subject subject) {
		this.subject = subject;
	}
	
	public void update() {
		System.out.println("Binary: Change of State = " + Integer.toBinaryString(subject.getState()));
	}
	
	
}
