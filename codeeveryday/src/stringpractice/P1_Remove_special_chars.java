package stringpractice;

public class P1_Remove_special_chars {
	public static void main(String[] args) {
		 String str=" siii    @rd&   !!";
		 String str1="hello  tyyy  ";
		 String result = removespecialchars(str1);
	     System.out.println(result);
		}

	private static String removespecialchars(String str1) {
		str1= str1.trim();
		str1=str1.replaceAll("[^a-zA-Z0-9]", "");		
		return str1;
	}


}
