package tnsif.nonaccessmodifiers;


abstract class Shapes{
	
	abstract void draw(); //functionality or declaration

}

class Frustum extends Shapes{
	
	void draw() {
		System.out.println("Drawing a Frustum");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		
		Frustum f = new Frustum();
		f.draw();
		
		
		

	}

}
