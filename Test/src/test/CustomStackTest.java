package test;

public class CustomStackTest {
	public static void main(String[] args) {
		CustomStack cs = new CustomStack();
		
		cs.push(1);
		cs.push(2);
		cs.push(3);
		cs.push(4);
		cs.push(5);
		cs.push(6);
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop() + "\n");
		
		cs.push(1);
		cs.push(2);
		cs.push(3);
		cs.push(4);
		cs.push(5);
		cs.push(6);
		cs.increment(3, 2);
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.pop() + "\n");
	}
}
