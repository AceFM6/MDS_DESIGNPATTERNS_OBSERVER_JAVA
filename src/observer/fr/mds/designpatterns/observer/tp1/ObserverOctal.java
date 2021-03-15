package observer.fr.mds.designpatterns.observer.tp1;

public class ObserverOctal implements Observer{
	
	private String name;

	public ObserverOctal(String name) {
		this.name = name;
	}

	@Override
	public void update(int state) {
		System.out.println(this.name + " String: " + Integer.toOctalString(state));
	}
	
}
