package Five;

public class wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*compareTo
		 * using this methode to compare a primitiv with an object 
		 * but two different types can't compare */
		Integer I = 10 ;
		
		System.out.println("test to use simple method test.compare " + I.compareTo(9));
		System.out.println("test to use simple method test.compare " + I.compareTo(10));
		System.out.println("test to use simple method test.compare " + I.compareTo(11));
		Boolean B = true;
		Boolean B2 = false;
		Boolean B3= false;
		System.out.println("test to use simple method test.compare  boolean " + B.compareTo(B2));
		System.out.println("test to use simple method test.compare  boolean  " + B.compareTo(B3));
		System.out.println("test to use simple method test.compare boolean " + B.compareTo(B));
		
	
		

	}

}
