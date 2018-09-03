
public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
	      String anotherString = "Nisar Ahmed";
	      Object objStr = str;

	      System.out.println( str.compareTo(anotherString) );
	      System.out.println( str.compareToIgnoreCase(anotherString) );
	      System.out.println( str.compareTo(objStr.toString()));

	}

}
