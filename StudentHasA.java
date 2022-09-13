class AddressHasA {
	String state,country,city,area;
	AddressHasA(String city,String state,String country ,String area ){
		this.city=city;
		this.state=state;
		this.country=country;
		this.area=area;
	}
}

public class StudentHasA {
int id;
String name;
AddressHasA address;   //Aggregation
public StudentHasA(int id,String name,AddressHasA address) {
	this.id=id;
	this.name=name;
	this.address=address;
}
void show() {
	System.out.println(id+"    "+name);
	System.out.println(address.city+"  "+address.state+"  "+address.country+"  "+address.area);
}
	public static void main(String[] args) {
		
		AddressHasA obj1= new AddressHasA("aa","ab","ac","ad");
		StudentHasA obj2=new StudentHasA(101,"Avik",obj1);
		obj2.show();

	}

}
