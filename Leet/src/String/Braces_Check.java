package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class X {
	int a ;
	public <X> X(X x) {
		this.a = (int) x;
	}
}

public class Braces_Check {

	public static void main(String args[]) {
        X val =  new X(1);
        System.out.println(val);
		Braces_Check bc = new Braces_Check();
		String[] values = { "{}", "[}", "()", "{)", "{}", "[}" };
		values = bc.braces(values);
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		List arr = new ArrayList();
		arr.add("hello");
		arr.add(1);

		for (Object o : arr) {
			System.out.println(o);
		}

	}

	public String[] braces(String[] values) {
		String[] result = new String[values.length];
		for (int i = 0; i < values.length; i++) {
			boolean flag = false;
			Stack<Character> stack = new Stack<Character>();
			char[] chr = values[i].toCharArray();
			for (char c : chr) {
				if (c == '(')
					stack.push(')');
				else if (c == '{')
					stack.push('}');
				else if (c == '[')
					stack.push(']');
				else if (stack.isEmpty() || stack.pop() != c) {
					result[i] = "NO";
					flag = true;
				}
			}
			if (!flag)
				result[i] = (stack.isEmpty()) ? "YES" : "NO";
		}
		return result;
	}

}
