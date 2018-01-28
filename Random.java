public class Random {
	public static void main(String [] args){
		int x1;
		int x2;
		double x3;
		
		x1 = 34 +(int)(Math.random()*50);
		x2 =(int)(Math.random()*999);
		x3 =5.5 +(int)(Math.random()*55.5);

		System.out.println("The random number between 34 and 50 is : " + x1);
		System.out.println("The random number between 0 and 999 is : " + x2);
		System.out.println("The random number between 5.5 and 55.5 is : " + x3);

	}
}
