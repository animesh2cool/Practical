public class Stvariable {
		int roll;
		String name;
		float fees;
		static String college="SRM";
		Stvariable(int roll,String name,float fees){
			this.roll=roll;
			this.name=name;
			this.fees=fees;
		}
		void show() {
			System.out.println(roll+" "+name+" "+fees);
		}
		static class Stavariable{
			public static void main(String[] args) {
				Stvariable obj1=new Stvariable(01,"avik",500);
				Stvariable obj2=new Stvariable(02,"avik",500);
				obj1.show();
				obj2.show();
			}
	}
}
