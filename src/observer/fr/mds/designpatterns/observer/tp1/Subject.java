package observer.fr.mds.designpatterns.observer.tp1;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private final List<Observer> observers = new ArrayList<Observer>();
	int state;	  

	public Subject() {
		
	}

	public void attach(Observer observer) {
	    if (!observers.contains(observer)) {
	      this.observers.add(observer);
	    }
	  }

	  public void detach(Observer observer) {
	    if (observers.contains(observer)) {
	      this.observers.remove(observer);
	    }
	  }

	  protected void notifyObservers(int state) {
	    for (Observer observer : observers) {
	      observer.update(state);
	    }
	  }
	  
	  public void setState(int state) {
		  this.state = state;
		  this.notifyObservers(this.state);
	  }
	  
	}