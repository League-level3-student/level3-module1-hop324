package _02_Integer_Stack;

public class IntegerStack {
	//1. create a private array of integers
	private int[] ints;
	//2. complete the constructor by initializing the member array
	//   to a new array of length 0. This prevents null pointer exceptions.
	public IntegerStack() {
		int[] thing = new int[0];;
		ints = thing;
	}
	
	//3. Complete the steps in the push method.
	public void push(int v) {
		//A. create a new array that is one element larger than the member array
		int[] pusher = new int[ints.length+1];
		//B. set the last element of the new array equal to the integer passed into the method
		pusher[pusher.length-1] = v;
		//C. iterate through the member array and copy all the elements into the new array
		for(int i = 0; i < ints.length; i++) {
			pusher[i] = ints[i];
		}
		//D. set the member array equal to the new array.
		ints = pusher;
	}
	
	//4. Complete the steps in the pop method.
	public int pop() {
		//A. create an integer variable and initialize it to the
		//   last element of the member array.
		int poppin = ints[ints.length-1];
		//B. create a new array that is one element smaller than the member array
		int[] off = new int[ints.length-1];
		//C. iterate through the new array and copy every element from the
		//   member array to the new array
		for(int i = 0; i < ints.length-1; i++) {
			off[i] = ints[i];
		}
		//D. set the member array equal to the new array
		ints = off;
		//E. return the variable you created in step A
		return poppin;
	}
	
	//5. Complete the clear method to set the
	//   member array to a new array of length 0
	public void clear() {
		int[] clear = new int[0];
		ints = clear;
	}
	
	//6. Complete the size method to return 
	//   the length of the member array
	public int size() {
		return ints.length;
	}
}
