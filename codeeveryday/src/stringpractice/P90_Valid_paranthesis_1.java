package stringpractice;

public class P90_Valid_paranthesis_1 {

	public static void main(String[] args) {
	
		String str="))((";
		char[] array = str.toCharArray();
		
		int count=0;
		for(char ch : array) {
			if(ch=='(') {
				count++;
			}else {
				count--;
			}
			if(count <0 ) {
				break;
			}
		}
		if(count!=0) {
			System.out.println("not valid");
		}
		else {
			System.out.println("valid");
		}
	}

}
