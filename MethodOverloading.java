public class MethodOverloading {
	
static int add(int a,int b) {  // two argument
	return a+b;
}
static int add(int a,int b,int c) {    // three argument
	return a+b+c;
}
class Test{
	
}
	public static void main(String[] args) {
		System.out.println(MethodOverloading.add(1, 2) );
		System.out.println(MethodOverloading.add(3, 4,5) );
	}

}
