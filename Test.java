package varsha;
//OOPS
//inheritance
//polymorphism 1)method overloading   2)method overriding
//encapsulation
//abstraction
public class Test {
	void add(String d)
	{
		System.out.println("method1");
		
	}
	void add(int a, int b)
	{
		System.out.println("method2");
	}
public static void main(String[] args) {
	Test address = new Test();
	address.add("hello");
	address.add(2,4);
}
}
