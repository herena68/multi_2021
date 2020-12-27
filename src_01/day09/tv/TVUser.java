package day09.tv;

public class TVUser {
	public static void main(String[] args) {
		TV user1 = new STV();
		TV user2 =  new LTV();

		tv(user2);
		
	}
	
	public static void tv(TV tv) {
		tv.powerOn();
	}
	
	
}
