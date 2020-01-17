import java.util.*;

public class SortStack {

	public static Stack<Integer> sortStack(Stack<Integer> s) {

		Stack<Integer> temp = new Stack<Integer>();
		int curr;

		while(!s.isEmpty()) {

			curr = s.pop();

			//if temp stack is empty or current is smaller than peek, push current
			if(temp.isEmpty() || curr < temp.peek())
				temp.push(curr);

			//if temp stack is not empty and current is larger than peek
			else {

				//pop temp stack elements into original stack until empty or current is smaller than peek
				while(!temp.isEmpty() && curr > temp.peek())
					s.push(temp.pop());

				//once temp stack is either empty or current is smaller than peek, push current
				temp.push(curr);

			}

		}

		//if descending order (min on top) then push back temp stack into original stack
		while(!temp.isEmpty())
			s.push(temp.pop());

		//if ascending order, return temp stack instead
		return s;

	}

	public static void displayStack(Stack<Integer> s) {

		for(Integer i : s) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();
		Random r = new Random();
		int n = 10;

		for(int i=0; i<n; i++) {

			s.push(r.nextInt(10));

		}

		System.out.println("Before Sort:");
		displayStack(s);
		System.out.println();

		s = sortStack(s);

		System.out.println("After Sort:");
		displayStack(s);
		System.out.println();


	}

}
