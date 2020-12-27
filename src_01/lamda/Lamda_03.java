package lamda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Lamda_03 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "root");
		map.put("pw", "1234");
		map.put("ip", "192.168.10.1");
		
		map.forEach(new BiConsumer<String, String>() {
			@Override
			public void accept(String k, String v) {
				System.out.println(k+"="+v);
			}
		});
		System.out.println();
		map.forEach(( k,  v) ->	System.out.println(k+"="+v)	);
		System.out.println();
	}
}
