import java.util.ArrayList;
import java.util.List;

public class Subject {
	private Observer observer;
	private List <Observer> observers;
	private int state;
	
	public Subject() {
		observers = new ArrayList<Observer>();
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	public void attach(Observer ob) {
		observers.add(ob);
	}
	
	public void notifyAllObservers() {
		for(Observer o : observers) {
			o.update();
		}
	}
	
}
