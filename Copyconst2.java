public class Copyconst2 {
	int age;
	String name;
	Copyconst2(int a,String n){
		age=a;
		name =n;
	}
	Copyconst2(){}
	void show() {
		System.out.println(age+"  "+name);
	}
	public static void main(String[] args) {
		Copyconst2 obj1=new Copyconst2(25,"Avik");
		Copyconst2 obj2=new Copyconst2();
		obj2.age=obj1.age;
		obj2.name=obj1.name;
		obj1.show();
		obj2.show();
	}
}
