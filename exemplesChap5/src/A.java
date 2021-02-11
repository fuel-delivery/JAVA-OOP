
public class A {
	private int x;
	private int y;
	public A() {
		
	}
	public A(int a, int b) {
		x=a;
		y=b;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}
	public void print() {
		System.out.println("("+x+","+y+")");
	}

}
