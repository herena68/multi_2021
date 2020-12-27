package BookApp.A;

import java.io.Serializable;
import java.util.HashMap;

public class Book<T, P> extends HashMap<String, Integer> implements Serializable{
	public Book(){
		super();
	}
	
	public Book(T title, P price) {
		super();
	}

}
