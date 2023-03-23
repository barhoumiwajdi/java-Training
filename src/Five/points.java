package Five;

public class points {



	public static void main(String[] args) {
		int a = -10;
		int b = 100;
		String name = "wajdi";
		int smaller = a>b ?a:b ;
		String verif = name.equals("wajd")?" this is true": "its not true ";
		System.out.println(smaller);
		System.out.println(verif);
		System.out.println(name);
		System.out.println(a==0 ?"Zero": a<0 ? "negatif number " :"positif number ");
		System.out.println(name==""? "chaine vide " :" some thing was wrotten");
		// TODO Auto-generated method stub

		Cat cat = new Cat();
		Dog dog = new Dog();
		if( cat instanceof Mammls) {
			System.out.println("cat is an Mammls .....");
		}
		else {
			System.out.println("try to verify");
		}
		
		if( dog instanceof Animal) {
			System.out.println("dog is an animal .....");
		}
		else {
			System.out.println("try to verify");
		}
		
		/*
		 * autoboxing*/
		Integer intobject = Integer.valueOf(300);
		System.out.println(" this is an integer object " + intobject);
		
		Integer intobjt = 40 ;/* its the same as the Integer.valueOf(40)*/
		System.out.println(intobjt);
	
		
		Double doubleobject = Double.valueOf(12.2);
		System.out.println(" this is an double object " +  doubleobject);
		/*unboxing*/
		
		int primitiv = intobject;
		System.out.println("this is a primitive integer "+primitiv);
		double primitivdouble = doubleobject;
		System.out.println("this is a primitive double " +primitivdouble);
		
		
	/* we use autoboxing because there is many methods we can apply on it */
		
		Integer Intobj = Integer.valueOf("300");
		Double Doubleobj = Double.valueOf("300.00");
		Boolean Booleanobj = Boolean.valueOf("false");
		/*if we are giving a wrong value there will be error runtime exception*/
		/*Number formatException*/ 
		/**
		 * exemple Integer I2 = Integer.valueOf(Twenty);
		 */
		System.out.println("all those values are  " + Booleanobj +  " ," +  Intobj +" ," + Doubleobj );
		
		/*
		 * binary représentation exepmles valueof(string s , radix x ) is to convert binary to integer 
		 * */
		Integer IR = Integer.valueOf("1010" , 2) ;
		System.out.println(IR);
		
		/* value of primitive */
		Integer Intobj1 = Integer.valueOf(300);
		Double Doubleobj1 = Double.valueOf(300.00);
		Boolean Booleanobj1 = Boolean.valueOf(false);
		Character Chracterobj1 = Character.valueOf('a');
		
		
		/*  we can get different value of the same wrapper class */
		
		System.out.println("convert integer to byte " + Intobj1.byteValue());
		System.out.println("convert integer to shortvalue " +  Intobj1.shortValue());
		System.out.println("convert integer to intvalue  " +  Intobj1.intValue());
		System.out.println("convert integer to float  " +  Intobj1.floatValue());
		System.out.println("convert integer to double " +  Intobj1.doubleValue());
		System.out.println("convert integer to long value " +  Intobj1.longValue());
		
		/*parse string s */
		int i = Integer.parseInt("50");
		double d = Double.parseDouble("550.25");
		boolean bo = Boolean.parseBoolean("true");
		
		System.out.println("testing parse string " +bo + " ," + d +", " + i );
		
		/*convert radix string to parse primitve */
		int i1 = Integer.parseInt("1010001" , 2);
		long l = Long.parseLong("1010" , 2);
		System.out.println("converting radix string s to primitive " + i1 +" , "+ l );
		
		/* convert objt to string */
		String s = intobject.toString();
		System.out.println("convert object to string " + s);
		/* convert to string( primitive p )*/
	 
		String s2 = intobject.toString(300);
		String s3 = Character.toString('c');
		System.out.println("convert  to string  (primitive p) " + s2 + " , "+ s3 );
		System.out.println("convert object to string " + s);
		/* convert to string( primitive p , radix x )*/
	 
		String s4 = Long.toString(300 , 2 );
	 
		System.out.println("convert  to string  (primitive p , radix x ) method =  " + s4);
	}

}
