
public class ObserverPatternDemo {
	
	public static void main(String args[]) {
		Subject sub1 = new Subject();
		
		Observer observerHexa = new HexaObserver(sub1);
		Observer observerOctal = new OctalObserver(sub1);
		Observer observerBinary = new BinaryObserver(sub1);
		
		sub1.attach(observerHexa);
		sub1.attach(observerOctal);
		sub1.attach(observerBinary);
		
		sub1.setState(25);
		
		sub1.notifyAllObservers();
		
	}
	
}
