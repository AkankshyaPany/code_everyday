package stringpractice;

public class P3_Lastwordofstring {

	public static void main(String[] args) {
	    String str = "hello world";
	    System.out.println(str.length());

	    int result = lastwordofstring(str);
	    int resultnew = eficientlastwordofstring(str);
	    System.out.println(result);
	    System.out.println(resultnew);
	}

	private static int lastwordofstring(String str) {
	    str = str.trim();
	    int count = 0;

	    for (int i = str.length() - 1; i >= 0; i--) {
	        if (str.charAt(i) == ' ') {
	            break;
	        }
	        count++;
	    }
	    return count;
	}

	private static int eficientlastwordofstring(String str) {

		str = str.trim();
		StringBuilder sb= new StringBuilder(str);
		int count=0;
		 for (int i = sb.length() - 1; i >= 0; i--) {
		        if (sb.charAt(i) == ' ') {
		            break;
		        }
		        count++;
		    }
		    return count;
	}


}
