package stringpractice;

public class P8_ReverseString {

	public static void main(String[] args) {
		String str = "hello world people ";
		String[] result = str.split("\\s+");
		
		StringBuilder sb= new StringBuilder();
		
		String str2 = ""; //empty string
		
		for(int i=result.length-1;i>=0;i--) {
			sb.append(result[i]+str2);
			sb.reverse();	
			}
		
		System.out.println(sb.toString());
		
		//using reverse()
		String sentence = "abhi on a break";
		StringBuilder sb1= new StringBuilder(sentence);
		sb1.reverse();
		System.out.println(sb1.toString());

	}

}
