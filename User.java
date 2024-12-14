package inheritance;
class Guest {
	public void read () {
		System.out.println("read the code");
	}
}
class Developer extends Guest {
	public void write(){
		System.out.println("write the code");

	}
}
class Admin extends Developer{
	public void manage(){
		System.out.println("manage the code");

	}
}
public class User {
	public static void main(String[] args) {
		Guest g=new Guest ();
		g.read();
		Developer dev=new Developer();
		dev.read();
		dev.write();
		Admin ad=new Admin();
		ad.read();
		ad.write();
		ad.manage();
	}
}
