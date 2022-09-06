class OTM{
	int age;
	String name;
void input(int a,String n) {
    age=a;
	name=n;
}
void display() {
	System.out.println(name+ " "+age);
}

public class ObjectThroughMethod {

	public static void main(String[] args) {
		OTM obj=new OTM();
		OTM obj1=new OTM();
		obj.input(29, "dev");
		obj1.input(25,"abhshj");
		obj.display();
		obj1.display();
		
	}

}
}
