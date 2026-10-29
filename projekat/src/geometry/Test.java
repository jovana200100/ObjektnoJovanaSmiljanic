package geometry;

public class Test {

	public static void main(String[] args) {
		//VEZBE 3
		int broj=20;
		System.out.println(broj);
		
		point p1= new point ();
		System.out.println(p1);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		System.out.println(p1.isSelected());
		
		p1.setX (100);
		System.out.println(p1.getX());
		
		//Razdvajanje koncepta reference od koncepta objekta
		
		point p2 = new point ();
		// p2 = ( x =0 , y = 0), p1 = (x = 100, y = 0)
		System.out.println (p2.getX());
		p2 = p1;
		System.out.println (p2.getX());
		p2.setY(20);
		System.out.println(p1.getY());
		System.out.println(p2.getY());
		
		

	}

}
