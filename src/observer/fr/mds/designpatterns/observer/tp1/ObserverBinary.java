package observer.fr.mds.designpatterns.observer.tp1;

public class ObserverBinary implements Observer {
	
	private String name;

	public ObserverBinary(String name) {
		this.name = name;
	}

	@Override
	public void update(int state) {
		System.out.println(this.name + " String: " + Integer.toBinaryString(state));
	}
	
}
