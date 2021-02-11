
public class Number {
	private int value;
	public Number(int val) {
		this.value=val;
	}
	public void inc() {
		value++;
	}
	public void inc(int step) {
		this.value=value+step;
	}
	public void afficher() {
		System.out.println(value);
	}
	public static void main(String[] args) {
		Number n=new Number(20);
		n.afficher();
		n.inc();
		n.afficher();
		n.inc(5);
		n.afficher();
	}

}
