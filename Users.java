package interfaces;
interface Laptops {
	public void copy ();

	public void paste ();

	public void cut();

	public void keyboard();
	
	default void Security() {
		System.out.println("Security code");
		commoncode();
	}
		static void audio() {
			System.out.println("Audio access");
			commoncode();
		}
		private static void commoncode() {
			System.out.println("commoncode access");
		}
	}
 class Lenovo implements Laptops{

	@Override
	public void copy() {
	System.out.println("Lenovo copy code");	
	}

	@Override
	public void paste() {
		System.out.println("Lenovo paste code");	
		
	}

	@Override
	public void cut() {
		System.out.println("Lenovo cut code");	
		
	}

	@Override
	public void keyboard() {
		System.out.println("Lenovo keyboard code");
		
	}

}
class Hp implements Laptops{
	 public void copy() {
		 System.out.println("Hpcopy code");
	 }
	 public void paste () {
		 System.out.println("hp paste code");
	 }
		public void cut() {
			System.out.println("hpcut code");
		}
		@Override
		public void keyboard() {
			System.out.println("hp keyboard code");
			
		}
		
	}
class Apple implements Laptops {

	@Override
	public void copy() {
		System.out.println("apple copy code");
		
	}

	@Override
	public void paste() {
		
		System.out.println("apple paste code");
	}

	@Override
	public void cut() {
		System.out.println("apple cut code");
	}

	@Override
	public void keyboard() {
		
		System.out.println("apple keyboard code");
	}

}
public class Users{
	public static void main(String[] args) {
		Lenovo l=new Lenovo();
		l.copy();
		l.paste();
		l.cut();
		l.keyboard();
		Laptops.audio();

		Hp hp=new Hp();
		hp.copy();
		hp.paste();
		hp.cut();
		hp.keyboard();

		Apple a=new Apple();
		a.copy();
		a.paste();
		a.cut();
		a.keyboard();
	}
}



