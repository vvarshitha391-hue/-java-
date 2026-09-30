package varsha;
//inheritence
//method overreading
class Parent
{
	void property()
	{
		System.out.println("property");
	}
 	void marry()
 	{
 		System.out.println("family selection");
 	}
}
public class Demo extends Parent{
	void marry() {
		System.out.println("campus selection");
	}
	public static void main(String[] args) {
		Demo bb = new Demo();
		bb.marry();
		bb.property();
	}

}
