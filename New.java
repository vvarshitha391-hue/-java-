package varsha;

abstract class Atm
{
	abstract void withdraw();
	abstract void deposite();
	
}
public class New extends Atm {
	void withdraw() {
		System.out.println("withdraw");
	}
	void deposite() {
		System.out.println("deposite");
	}
	public static void main(String[] args) {
     New ff = new New();
     ff.withdraw();
     ff.deposite();
	}
}
