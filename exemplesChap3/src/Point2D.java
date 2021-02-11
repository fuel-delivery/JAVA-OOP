
public class Point2D  {
	//les membres données
	private int x;
	private int y;
	/*
	public boolean egale(Object obj) {
		Point2D p=(Point2D)obj;
		if(x==p.x && y==p.y)
			return true;
		else
			return false;
	}*/
	@Override
	public boolean equals(Object obj) {
		Point2D p=(Point2D)obj;
		if(this.x==p.x && this.y==p.y)
			return true;
		else
			return false;
	}
	public Point2D() {
		super();
		x=0;
		y=0;
	}
	public Point2D(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void afficher() {
		System.out.println("Point:("+x+","+y+")");
	}

}
