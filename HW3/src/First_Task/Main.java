package First_Task;

public class Main {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		Rectangle r2 = new Rectangle(25, 20);
		
		
		System.out.println("Square of rectangle1 = [" + r1.Square() + "] | Perimeter of rectangle1 = [" + r1.Perimeter() +"]");

		System.out.println("Square of rectangle2 = [" + r2.Square() + "] | Perimeter of rectangle2 = [" + r2.Perimeter() +"]" + "\n");
		
		
		
		Circle c1 = new Circle(11.5, 23);
		
		System.out.println("Square of circle1 = [" + c1.Square() + "] | Lenghten of circle1 = [" + c1.Lenghten() +"]");

	}
}
