public class Ex804 extends Math{

	public static void main(String[] args) {
		int a = 10, b = 5;
		double c = 2.5, d = 4.5;
		
		Ex804 calc = new Ex804();
		
		//Add 더하기		
		System.out.println(a + "+" + b + "=" + calc.add(a,b)); // int, int
		System.out.println(a + "+" + c + "=" + calc.add(a,c)); // int, dbl
		System.out.println(c + "+" + d + "=" + calc.add(c,d)); // dbl, dbl
		
		//Divide 나누기
		System.out.println(a + "/" + b + "=" + calc.div(a,b)); 
		System.out.println(a + "/" + c + "=" + calc.div(a,c)); 
		System.out.println(c + "/" + d + "=" + calc.div(c,d)); 
	
		//Square 제곱하기
		System.out.println(a + "^2"  + "=" + calc.sqr(a)); 
		System.out.println(b + "^2"  + "=" + calc.sqr(b)); 
		System.out.println(c + "^2"  + "=" + calc.sqr(c)); 
		System.out.println(d + "^2"  + "=" + calc.sqr(d)); 
	}

}
