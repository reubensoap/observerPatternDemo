
public class OctalObserver extends Observer {
	public OctalObserver(Subject subject) {
		this.subject = subject;
	}
	
	public void update() {
		System.out.println("Octal: Change of State = " + Integer.toOctalString(subject.getState()));
	}
	
	
}
