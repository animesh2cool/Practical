public class Copyconst {
int age;
String name;
Copyconst(int a,String n){
	age=a;
	name =n;
}
Copyconst(Copyconst c){
	age=c.age;
	name=c.name;
}
void show() {
	System.out.println(age+"  "+name);
}
	public static void main(String[] args) {
		Copyconst obj1=new Copyconst(25,"Avik");
		Copyconst obj2=new Copyconst(obj1);
		obj1.show();
		obj2.show();
	}
}
