package stringpractice;

import java.util.Stack;

public class P91_Valid_parenthesis_2 {

	public static void main(String[] args) {
		String str="[]{{}})(";
		char[] array = str.toCharArray();
		Boolean isValid=true;
		Stack<Character> st = new Stack<>();
		for(char ch : array) {
			
			if(ch=='('||ch=='{'||ch=='[') {
				st.push(ch);
				isValid=true;
				System.out.println("adding to stack");
			}
			else {
				if(st.isEmpty()) {
					System.out.println("stack is empty. Nothing is there");
					isValid=false;
					break;
				}else {
					char top = st.pop();
					System.out.println("remove from stack");
					if (( ch == ')' && top != '(') ||
			            (ch == '}' && top != '{') ||
			            (ch == ']' && top != '[')) {
						System.out.println("stoping..");
						isValid=false;
						break;
					 }
				}
			}
		}
		if(!st.isEmpty()) {
			System.out.println("not valid balanced paraenthesis");
		}if (isValid) {
	        System.out.println("valid parenthesis");
	    } else {
	        System.out.println("not valid balanced parenthesis");
	    }
	}

}
