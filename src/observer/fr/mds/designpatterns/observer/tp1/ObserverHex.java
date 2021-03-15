package observer.fr.mds.designpatterns.observer.tp1;

public class ObserverHex implements Observer {

	private String name;

	public ObserverHex(String name) {
		this.name = name;
	}

	@Override
	public void update(int state) {
		System.out.println(this.name + " String: " + Integer.toHexString(state).toUpperCase());
	}

}
