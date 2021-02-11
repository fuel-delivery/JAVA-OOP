
public class TestDate {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d.toString());
		Date d2=new Date(15, 3, 2020);
		System.out.println(d2.toString());
		Date d3=new Date("25.12/2020");
		System.out.println(d3.toString());
		Date d4=new Date("12.FévRier/2020");
		System.out.println(d4.toString());
	}

}
