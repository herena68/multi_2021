package ex;

public class Prob9_Dice {
	public static void main(String args[]) {

		int result1=0;
		try {
			result1 = Prob9_Dice.countSameEye(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

		int result2=0;
		try {
			result2 = Prob9_Dice.countSameEye(-10);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());

		}
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);

	}

	static int countSameEye(int n) throws NegativePlayException {
		// 구현
	    if (n < 0) throw new NegativePlayException("~~~~~");
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (d1.play() == d2.play())
				count++;
		}

		return count;
	}

}

class Dice {
	int size;

	Dice(int size) {
		this.size = size;
	}

	int play() {
		int number = (int) (Math.random() * size) + 1;
		return number;
	}
}


class NegativePlayException extends Exception{
	NegativePlayException(String msg){
		super(msg);
	}
}




