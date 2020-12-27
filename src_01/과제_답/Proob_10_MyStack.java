package util;

public class MyStack {
    int[] st;
    int count=0;
	
	public MyStack() {
		st = new int[10]; 
	}
	public MyStack(int size) {
		st = new int[size>0 ? size:10];
	}

	public boolean isEmpty() {
		return count==0?true:false;
	}
	public boolean isFull() {
		return count==st.length?true:false;
	}
	public void push(int i) {
		if(isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}else {
			st[count++]=i;
		}
	}

	public int pop() {
		int data = -1;
		if(count != 0) {
			data = st[count-1];
			st[count-1]=0;
			count--;
		}
		return data;
	}

	public int top() {
		return count==0?-1:st[count-1];
	}

public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}
	}

}
