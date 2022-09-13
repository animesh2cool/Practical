public class MethodOverloading2 {
	static int add(int a,int b) {                        // two argument
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}
	class Overload{
		public static void main(String[] args) {	
			System.out.println(MethodOverloading2.add(4, 5));
			System.out.println(MethodOverloading2.add(5.5, 2.5));
	   }
	}
}
