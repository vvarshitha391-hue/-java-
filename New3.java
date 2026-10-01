package varsha;
abstract class Atm1 {
	abstract void withdraw();
}
abstract class Atm2 extends Atm1 {
	abstract void deposite();
}
public class War extends Atm1 {
	void withdraw()
	{
		System.out.println("withdraw");
	}
	void deposite()
	{
		System.out.println("deposite");
	}
	public static void main(String[] args) {
	War gg = new War();
	gg.withdraw();
	gg.deposite();
	}
	
}
