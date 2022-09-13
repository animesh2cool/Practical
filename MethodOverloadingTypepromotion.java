public class MethodOverloadingTypepromotion {
 void sum(int a,int b) {
	System.out.println("int");
	System.out.println(a+b);
}
 void sum(long a,long b) {
	 System.out.println("long");
		System.out.println(a+b);
	}
 
	public static void main(String[] args) {
		MethodOverloadingTypepromotion a1=new MethodOverloadingTypepromotion();
		a1.sum(2L, 3L);

	}

}
