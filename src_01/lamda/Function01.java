package lamda;

import java.util.function.Function;

public class Function01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //const sum = (a,b)=>a+b   js
		Function<Integer, Integer> i2 
		  = (i)->i*i;
		  
        i2.apply(4);

	}

}
