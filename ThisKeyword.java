public class ThisKeyword {
	int roll;
	String name;
	float fees;
	ThisKeyword(int roll,String name,float fees){        //constructor
		this.roll=roll;
		this.name=name;
		this.fees=fees;
	}
	void display() {                                            //method
		System.out.println(roll+" "+name+" "+fees);
	}
	class Test{
	public static void main(String[] args) {
		ThisKeyword s1=new ThisKeyword(12,"Avik",5000);    //object
		ThisKeyword s2=new ThisKeyword(15,"Amal",6000);
		s1.display();
		s2.display();
	}
  }
}
