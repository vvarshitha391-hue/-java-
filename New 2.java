package varsha;
//abstract
class Atm{
	void withdraw() {
		System.out.println("withdraw");
	}
	void deposite() {
		System.out.println("deposite");
	}
}
public class New extends Atm{
	public static void main(String[] args) {
		New ff = new New();
		ff.withdraw();
		ff.deposite();
	}
	

}
